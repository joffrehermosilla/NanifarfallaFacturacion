package joffre.NanifarfallaRest.controller.pruebas;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsContrller {
	
	@Value("${texto.ejemploparamcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.ejemploparamcontroller.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.ejemploparamcontroller.listar.titulo}")
	private String textoListar;
	
	
	
	@GetMapping("/")
	public String paramx() {

		return "/pruebas/indexparam";
	}

	@GetMapping("/string")
	public String param(@RequestParam(name = "texto", required = false, defaultValue = "Algun valor") String texto,
			Model model) {
		model.addAttribute("resultado",textoIndex  + texto);

		return "/pruebas/verparam";
	}

	@GetMapping("/mix-params")
	public String paramx(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		model.addAttribute("resultado", textoIndex + saludo + textoListar + numero+"'");

		return "/pruebas/verparam";
	}

	@GetMapping("/http-params")
	public String paramx(HttpServletRequest request, Model model) {
		Integer numero = null;
		String saludo = request.getParameter("saludo");
		try {
			numero = Integer.parseInt(request.getParameter("numero"));
		}

		catch (NumberFormatException e) {
			numero = 0;
		}

		model.addAttribute("resultado", textoIndex + saludo + textoListar + numero);

		return "/pruebas/verparam";
	}

}
