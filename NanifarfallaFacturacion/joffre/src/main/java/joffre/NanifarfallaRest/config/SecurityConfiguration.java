package joffre.NanifarfallaRest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import joffre.NanifarfallaRest.auth.LoginSuccessHandler;
import joffre.NanifarfallaRest.repository.UsuarioRepository;
import joffre.NanifarfallaRest.security.CustomRememberMeServices;
import joffre.NanifarfallaRest.security.google2fa.CustomAuthenticationProvider;
import joffre.NanifarfallaRest.security.google2fa.CustomWebAuthenticationDetailsSource;
import joffre.NanifarfallaRest.security.location.DifferentLocationChecker;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

import org.springframework.security.config.annotation.web.builders.WebSecurity;

import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;

import java.io.File;
import java.io.IOException;

@Configuration
@ComponentScan(basePackages = { "joffre.NanifarfallaRest.security" })
//@ImportResource({ "classpath:webSecurityConfig.xml" })
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	/*
	 * @Autowired private UserDetailsService userDetailsService;
	 */
	/*
	 * @Autowired private AuthenticationSuccessHandler
	 * myAuthenticationSuccessHandler;
	 * 
	 * @Autowired private LogoutSuccessHandler myLogoutSuccessHandler;
	 * 
	 * @Autowired private AuthenticationFailureHandler authenticationFailureHandler;
	 * 
	 * @Autowired private CustomWebAuthenticationDetailsSource
	 * authenticationDetailsSource;
	 * 
	 * @Autowired private UsuarioRepository userRepository;
	 * 
	 * @Autowired private DifferentLocationChecker differentLocationChecker;
	 */

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	private LoginSuccessHandler successHandler;

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	/*
	 * @Override protected void configure(final AuthenticationManagerBuilder auth)
	 * throws Exception { auth.authenticationProvider(authProvider()); }
	 */

	
	

	/*
	 * @Override protected void configure(final AuthenticationManagerBuilder auth)
	 * throws Exception { auth.authenticationProvider(authProvider()); }
	 */
	 

	
	
	
	
	
	@Override
	public void configure(final WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**").antMatchers("/h2/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/", "/css/**", "/js/**", "/images/**", "/listar").permitAll()
				.antMatchers("/ver/**").hasAnyRole("USER").antMatchers("/uploads/**").hasAnyRole("USER")
				.antMatchers("/form/**").hasAnyRole("ADMIN").antMatchers("/eliminar/**").hasAnyRole("ADMIN")
				.antMatchers("/factura/**").hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
				.successHandler(successHandler).loginPage("/login").permitAll().and().logout().permitAll().and()
				.exceptionHandling().accessDeniedPage("/error_403");

	}

	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception {
		PasswordEncoder encoder = passwordEncoder();
		UserBuilder users = User.builder().passwordEncoder(encoder::encode);
		builder.inMemoryAuthentication().withUser(users.username("admin").password("1234").roles("ADMIN", "USER"))
				.withUser(users.username("joffre").password("1234").roles("USER"));
	}

	// beans

	/*
	 * @Bean public DaoAuthenticationProvider authProvider() { final
	 * CustomAuthenticationProvider authProvider = new
	 * CustomAuthenticationProvider();
	 * authProvider.setUserDetailsService(userDetailsService);
	 * authProvider.setPasswordEncoder(encoder());
	 * authProvider.setPostAuthenticationChecks(differentLocationChecker); return
	 * authProvider; }
	 */

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder(11);
	}

	@Bean
	public SessionRegistry sessionRegistry() {
		return new SessionRegistryImpl();
	}

	/*
	 * @Bean public RememberMeServices rememberMeServices() {
	 * CustomRememberMeServices rememberMeServices = new
	 * CustomRememberMeServices("theKey", userDetailsService, new
	 * InMemoryTokenRepositoryImpl()); return rememberMeServices; }
	 */

	@Bean(name = "GeoIPCountry")
	public DatabaseReader databaseReader() throws IOException, GeoIp2Exception {
		final File resource = new File("src/main/resources/maxmind/GeoLite2-Country.mmdb");
		return new DatabaseReader.Builder(resource).build();
	}

}
