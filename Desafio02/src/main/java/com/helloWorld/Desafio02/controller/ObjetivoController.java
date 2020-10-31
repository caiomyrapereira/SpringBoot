package com.helloWorld.Desafio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {

	@GetMapping()
	public String objetivo() {
		return "O meu objetivo do bootcamp da Generation é se tornar Full stack.";
	}
}
