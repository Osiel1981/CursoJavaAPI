package com.example.testeDB.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/busca")
public class CursoResource {
		
	@GetMapping
	public String getcursos() {
		return "Cursos em geral";
	}
	
}
