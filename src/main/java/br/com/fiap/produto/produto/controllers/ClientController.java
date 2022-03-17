package br.com.fiap.produto.produto.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.produto.produto.model.Client;

@Controller
public class ClientController {
	
	@GetMapping("/clientes")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("clientes/index");
			//String cliente, Long documento, String endereço
		Client cliente1 = new Client(new Long(1), "Giovanna", "52.208.578-3", "Rua Gaspar Oliveira, 456");
		Client cliente2 = new Client(new Long(2),"Juliano", "22.238.534-3", "Rua Oliveira Gaspar , 342");
		Client cliente3 = new Client(new Long(3),"Isabella", "88.876.389-3", "Rua Oliveira Antonio, 332");
		
		List<Client> clientes = Arrays.asList(cliente1, cliente2, cliente3);
		modelView.addObject("listarClientes", clientes);
		
		return modelView;
	}
}
