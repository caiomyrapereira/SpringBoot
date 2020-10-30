package com.helloword.Desafio01.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {

	@GetMapping("/mentalidades")
	public String mentalidade() {
		
		return "Persistência!!!";
	}
	
	@GetMapping("/comportamentais")
	public String comportamentais() {
		
		return "Orientação ao detalhe!!!";
		
	}
	
}
