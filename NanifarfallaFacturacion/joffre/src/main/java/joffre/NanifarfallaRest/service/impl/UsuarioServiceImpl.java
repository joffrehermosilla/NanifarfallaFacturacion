package joffre.NanifarfallaRest.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.maxmind.geoip2.DatabaseReader;

import joffre.NanifarfallaRest.model.ContactModel;
import joffre.NanifarfallaRest.model.Distrito;
import joffre.NanifarfallaRest.model.NewLocationToken;
import joffre.NanifarfallaRest.model.PasswordRessetToken;
//import joffre.NanifarfallaRest.model.EstadoUsuario;
import joffre.NanifarfallaRest.model.RequestUsuario;
import joffre.NanifarfallaRest.model.UserLocation;
//import joffre.NanifarfallaRest.model.TipoUsuario;
import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.model.VerificationToken;
import joffre.NanifarfallaRest.repository.NewLocationTokenRepository;
import joffre.NanifarfallaRest.repository.PasswordRessetTokenRepository;
import joffre.NanifarfallaRest.repository.RoleRepository;
import joffre.NanifarfallaRest.repository.UserLocationRepository;
import joffre.NanifarfallaRest.repository.UsuarioRepository;
import joffre.NanifarfallaRest.repository.VerificationTokenRepository;
import joffre.NanifarfallaRest.service.UsuarioService;
import joffre.NanifarfallaRest.web.dto.UserDto;
import joffre.NanifarfallaRest.web.error.UserAlreadyExistException;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Qualifier;


import java.net.InetAddress;
import java.net.URLEncoder;

import java.util.stream.Collectors;




import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;




@Component
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private VerificationTokenRepository tokenRepository;

	@Autowired
	private PasswordRessetTokenRepository passwordTokenRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private SessionRegistry sessionRegistry;

	@Autowired
	@Qualifier("GeoIPCountry")
	private DatabaseReader databaseReader;

	@Autowired
	private UserLocationRepository userLocationRepository;

	@Autowired
	private NewLocationTokenRepository newLocationTokenRepository;

	@Autowired
	private Environment env;

	public static final String TOKEN_INVALID = "invalidToken";
	public static final String TOKEN_EXPIRED = "expired";
	public static final String TOKEN_VALID = "valid";

	public static String QR_PREFIX = "https://chart.googleapis.com/chart?chs=200x200&chld=M%%7C0&cht=qr&chl=";
	public static String APP_NAME = "SpringRegistration";

	// API

	@Override
	public Usuario getUsuario(int usuarioId) {
		return usuarioRepository.findById(usuarioId).get();

	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(RequestUsuario requestUsuario) {
		Usuario usuario = new Usuario();
		usuario.setApellido_usuario(requestUsuario.getApellido_usuario());
		usuario.setNombre_usuario(requestUsuario.getNombre_usuario());
		usuario.setApellido_usuario(requestUsuario.getApellido_usuario());
		usuario.setDireccion_usuario(requestUsuario.getDireccion_usuario());
		usuario.setPassword_usuario(requestUsuario.getPassword_usuario());
		Distrito distrito = new Distrito();
		// TipoUsuario tipoUsuario = new TipoUsuario();
		// EstadoUsuario estadoUsuario = new EstadoUsuario();
		distrito.setCodigo_distrito(Integer.valueOf(requestUsuario.getDistrito()));
		// usuario.setDistrito(distrito);
		return null;
	}

	@Override
	public ObjectNode updateUsuarioEstado(int estado, int idUsuario) {
		// int result = usuarioRepository.updateEstado(estado, idUsuario);
//		boolean resultado = result == 1 ? true : false;
		ObjectNode objectNode = new ObjectMapper().createObjectNode();
//		objectNode.put("resultado", resultado);
		return objectNode;
	}

	@Override
	public ObjectNode login(String username, String password) {
		ObjectNode objectNode = new ObjectMapper().createObjectNode();
		/*
		 * if (usuarioRepository.login(username, password)) { Usuario usuario =
		 * usuarioRepository.getUsuarioLogin(username, password);
		 * objectNode.put("login", true); objectNode.set("usuario", new
		 * ObjectMapper().valueToTree(usuario)); } else { objectNode.put("login",
		 * false); }
		 */
		return objectNode;
	}

	@Override
	public Usuario addContact(ContactModel contactModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRegisteredUser(Usuario user) {
		usuarioRepository.save(user);

	}

	@Override
	public void deleteUser(Usuario user) {
	//	final VerificationToken verificationToken = tokenRepository.findByUser(user);

	//	if (verificationToken != null) {
	//		tokenRepository.delete(verificationToken);
	//	}

		//final PasswordRessetToken passwordToken = passwordTokenRepository.findByUser(user);

//		if (passwordToken != null) {
//			passwordTokenRepository.delete(passwordToken);
//		}

		usuarioRepository.delete(user);

	}

	@Override
	public void createVerificationTokenForUser(Usuario user, String token) {
		final VerificationToken myToken = new VerificationToken(token, user);
		tokenRepository.save(myToken);

	}



	



	
	// API

	@Override
	public Usuario registerNewUserAccount(final UserDto accountDto) {
		if (emailExists(accountDto.getEmail())) {
			throw new UserAlreadyExistException(
					"There is an account with that email address: " + accountDto.getEmail());
		}
		final Usuario user = new Usuario();

		user.setNombre_usuario(accountDto.getFirstName());
		user.setApellido_usuario(accountDto.getLastName());
		user.setPassword_usuario(passwordEncoder.encode(accountDto.getPassword()));
		user.setEmail(accountDto.getEmail());
		user.setUsing2FA(accountDto.isUsing2FA());
		user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));
		return usuarioRepository.save(user);
	}

	@Override
	public Usuario getUser(final String verificationToken) {
		final VerificationToken token = tokenRepository.findByToken(verificationToken);
		if (token != null) {
			return token.getmUsuario();
		}
		return null;
	}

	@Override
	public VerificationToken getVerificationToken(final String VerificationToken) {
		return tokenRepository.findByToken(VerificationToken);
	}






	@Override
	public VerificationToken generateNewVerificationToken(final String existingVerificationToken) {
		VerificationToken vToken = tokenRepository.findByToken(existingVerificationToken);
		vToken.updateToken(UUID.randomUUID().toString());
		vToken = tokenRepository.save(vToken);
		return vToken;
	}

	@Override
	public void createPasswordResetTokenForUser(final Usuario user, final String token) {
		final PasswordRessetToken myToken = new PasswordRessetToken(token, user);
		passwordTokenRepository.save(myToken);
	}

	@Override
	public Usuario findUserByEmail(final String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public PasswordRessetToken getPasswordResetToken(final String token) {
		return passwordTokenRepository.findByToken(token);
	}

	@Override
	public Optional<Usuario> getUserByPasswordResetToken(final String token) {
		return Optional.ofNullable(passwordTokenRepository.findByToken(token).getmUsuario());
	}

	@Override
	public Optional<Usuario> getUserByID(final long id) {
		return usuarioRepository.findById((int) id);
	}

	@Override
	public void changeUserPassword(final Usuario user, final String password) {
		user.setPassword_usuario(passwordEncoder.encode(password));
		usuarioRepository.save(user);
	}

	@Override
	public boolean checkIfValidOldPassword(final Usuario user, final String oldPassword) {
		return passwordEncoder.matches(oldPassword, user.getPassword_usuario());
	}

	@Override
	public String validateVerificationToken(String token) {
		final VerificationToken verificationToken = tokenRepository.findByToken(token);
		if (verificationToken == null) {
			return TOKEN_INVALID;
		}

		final Usuario user = verificationToken.getmUsuario();
		final Calendar cal = Calendar.getInstance();
		if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
			tokenRepository.delete(verificationToken);
			return TOKEN_EXPIRED;
		}

		user.setEnabled(true);
		// tokenRepository.delete(verificationToken);
		usuarioRepository.save(user);
		return TOKEN_VALID;
	}

	@Override
	public String generateQRUrl(Usuario user) throws UnsupportedEncodingException {
		return QR_PREFIX + URLEncoder.encode(String.format("otpauth://totp/%s:%s?secret=%s&issuer=%s", APP_NAME,
				user.getEmail(), user.getSecret(), APP_NAME), "UTF-8");
	}

	@Override
	public Usuario updateUser2FA(boolean use2FA) {
		final Authentication curAuth = SecurityContextHolder.getContext().getAuthentication();
		Usuario currentUser = (Usuario) curAuth.getPrincipal();
		currentUser.setUsing2FA(use2FA);
		currentUser = usuarioRepository.save(currentUser);
		final Authentication auth = new UsernamePasswordAuthenticationToken(currentUser, currentUser.getPassword_usuario(),
				curAuth.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(auth);
		return currentUser;
	}

	private boolean emailExists(final String email) {
		return usuarioRepository.findByEmail(email) != null;
	}

	@Override
	public List<String> getUsersFromSessionRegistry() {
		return sessionRegistry.getAllPrincipals().stream()
				.filter((u) -> !sessionRegistry.getAllSessions(u, false).isEmpty()).map(o -> {
					if (o instanceof Usuario) {
						return ((Usuario) o).getEmail();
					} else {
						return o.toString();
					}
				}).collect(Collectors.toList());
	}

	@Override
	public NewLocationToken isNewLoginLocation(String username, String ip) {

		if (!isGeoIpLibEnabled()) {
			return null;
		}

		try {
			final InetAddress ipAddress = InetAddress.getByName(ip);
			final String country = databaseReader.country(ipAddress).getCountry().getName();
			System.out.println(country + "====****");
			final Usuario user = usuarioRepository.findByEmail(username);
			final UserLocation loc = userLocationRepository.findByCountryAndUser(country, user);
			if ((loc == null) || !loc.isEnabled()) {
				return createNewLocationToken(country, user);
			}
		} catch (final Exception e) {
			return null;
		}
		return null;
	}

	@Override
	public String isValidNewLocationToken(String token) {
		final NewLocationToken locToken = newLocationTokenRepository.findByToken(token);
		if (locToken == null) {
			return null;
		}
		UserLocation userLoc = locToken.getUserLocation();
		userLoc.setEnabled(true);
		userLoc = userLocationRepository.save(userLoc);
		newLocationTokenRepository.delete(locToken);
		return userLoc.getCountry();
	}

	@Override
	public void addUserLocation(Usuario user, String ip) {

		if (!isGeoIpLibEnabled()) {
			return;
		}

		try {
			final InetAddress ipAddress = InetAddress.getByName(ip);
			final String country = databaseReader.country(ipAddress).getCountry().getName();
			UserLocation loc = new UserLocation(country, user);
			loc.setEnabled(true);
			userLocationRepository.save(loc);
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}

	private boolean isGeoIpLibEnabled() {
		return Boolean.parseBoolean(env.getProperty("geo.ip.lib.enabled"));
	}

	private NewLocationToken createNewLocationToken(String country, Usuario user) {
		UserLocation loc = new UserLocation(country, user);
		loc = userLocationRepository.save(loc);

		final NewLocationToken token = new NewLocationToken(UUID.randomUUID().toString(), loc);
		return newLocationTokenRepository.save(token);
	}

}
