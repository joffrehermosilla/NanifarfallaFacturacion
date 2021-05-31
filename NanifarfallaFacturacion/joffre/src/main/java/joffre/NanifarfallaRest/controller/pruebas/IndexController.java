package joffre.NanifarfallaRest.controller.pruebas;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import joffre.NanifarfallaRest.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "index", "/", "", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework con Model");

		return "/pruebas/index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre_usuario("Joffre");
		usuario.setApellido_usuario("Hermosilla Salas");
		usuario.setEmail("joffre@gmail.com");
		model.addAttribute("titulo", "Perfil del Usuario: ".concat(usuario.getNombre_usuario()));

		model.addAttribute("usuario", usuario);

		return "/pruebas/perfil";

	}

	@RequestMapping("/listar")
	public String listar(Model model) {

		List<Usuario> usuarios = Arrays.asList(new Usuario("Joffre", "Hermosilla", "j@gmail.com"),
				new Usuario("Constanza", "Hermosilla", "j@gmail.com"), new Usuario("Jr", "Hermosilla", "j@gmail.com"),
				new Usuario("Angela", "Garate", "j@gmail.com"));
		// List<Usuario> usuarios = new ArrayList<>();
		/*
		 * usuarios.add(new Usuario("Joffre","Hermosilla","j@gmail.com"));
		 * usuarios.add(new Usuario("Constanza","Hermosilla","j@gmail.com"));
		 * usuarios.add(new Usuario("Jr","Hermosilla","j@gmail.com"));
		 */
		model.addAttribute("titulo", "Listado de Usuarios: ".concat(""));

		model.addAttribute("usuarios", usuarios);

		return "/pruebas/listar";
	}

	

	@RequestMapping("/nuevolistar")
	public String nuevolistar(Model model) {

		// List<Usuario> usuarios = new ArrayList<>();
		/*
		 * usuarios.add(new Usuario("Joffre","Hermosilla","j@gmail.com"));
		 * usuarios.add(new Usuario("Constanza","Hermosilla","j@gmail.com"));
		 * usuarios.add(new Usuario("Jr","Hermosilla","j@gmail.com"));
		 */
		model.addAttribute("titulo", "Listado de Usuarios: ".concat(""));

		//model.addAttribute("usuarios", usuarios);

		return "/pruebas/listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Joffre", "Hermosilla", "j@gmail.com"),
				new Usuario("Constanza", "Hermosilla", "j@gmail.com"), new Usuario("Jr", "Hermosilla", "j@gmail.com"),
				new Usuario("Angela", "Garate", "j@gmail.com"));
		
		return usuarios;
	}

}