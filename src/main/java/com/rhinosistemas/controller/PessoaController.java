package com.rhinosistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rhinosistemas.model.Pessoa;
import com.rhinosistemas.repository.PessoaRepository;

@Controller
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	@RequestMapping(value = "/listagem")
	public String pessoas(Model model) {
		
		List<Pessoa> pessoas = repository.findAll();
		
		model.addAttribute("listagem", pessoas);
		
		return "pessoas/listagem";
	}

	@RequestMapping(value = "/novo")
	public String novo(Model model, Pessoa pessoa) {
		
		return "pessoas/cadastrar";
	}
	
	@RequestMapping(value = "/cadastrar")
	public String cadastrar(Model model, Pessoa pessoa) {
		
		repository.save(pessoa);
		
		return "redirect:/pessoas/listagem";
	}
	
}
