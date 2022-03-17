package br.com.fiap.produto.produto.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.produto.produto.model.Produto;

@Controller
public class ProductController {

	@GetMapping("/produtos")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("produtos/index");
		
		Produto produto1 = new Produto(new Long(1), "Chocolate", 3, new BigDecimal(2));
		Produto produto2 = new Produto(new Long(2), "Chocolate Belga", 3, new BigDecimal(40));
		Produto produto3 = new Produto(new Long(3), "Chocolate Branco", 3, new BigDecimal(20));
		
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3);
		modelView.addObject("listarProdutos", produtos);
		
		return modelView;
	}
}
