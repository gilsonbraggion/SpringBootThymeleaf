package com.rhinosistemas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/exemplo")
public class ExemploController {
	
	@RequestMapping(value = "/primeiro")
	public String primeiro() {
		return "exemplo/primeiro";
	}
	
}
