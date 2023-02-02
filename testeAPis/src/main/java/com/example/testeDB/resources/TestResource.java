package com.example.testeDB.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/teste")
public class TestResource {
	
	@GetMapping("/home")
	public String getOi() {
		return "Oi pessoal!";
	}
	
	@GetMapping("/index")
	public String getIndex() {
		return "Está em index";
	}
	
}