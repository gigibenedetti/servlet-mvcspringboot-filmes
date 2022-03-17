package br.com.fiap.produto.produto.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		request.setAttribute("nomeUsuario", "Giovanna Benedetti Ferreira");
		
		return "home";
	}
}
