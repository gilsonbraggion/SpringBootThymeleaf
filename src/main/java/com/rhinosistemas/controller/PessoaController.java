package com.rhinosistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rhinosistemas.model.Pessoa;
import com.rhinosistemas.repository.PessoaRepository;

@Controller
@RequestMapping(value = "pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	public String pessoas(Model model) {
		
		List<Pessoa> pessoas = repository.findAll();
		
		model.addAttribute("listagem", pessoas);
		
		return "pessoas/listagem";
	}
	
}
