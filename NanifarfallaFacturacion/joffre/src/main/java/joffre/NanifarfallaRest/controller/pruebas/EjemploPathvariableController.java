package joffre.NanifarfallaRest.controller.pruebas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploPathvariableController {

	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo", "RECIBIR PARAMETROS GET path variable");
		model.addAttribute("resultado", "El texto enviado en la ruta es: "+ texto);
		return "/pruebas/verpath";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String dosvariables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "RECIBIR PARAMETROS GET path variable");
		model.addAttribute("resultado", "El texto enviado en la ruta es: "+ texto+ "y el numero es: "+numero);
		return "/pruebas/verpath";
	}
	
	
}
