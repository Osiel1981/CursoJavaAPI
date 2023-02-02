package com.example.testeDB.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testeDB.entities.Curso;
import com.example.testeDB.services.CursoService;

@RestController
@RequestMapping(value = "busca")
public class CursoResource {
	
	@Autowired
	private CursoService cursoService;
	
	//Metodo GetMapping com responseEntity.ok().body(parametro)
	@GetMapping("/cursos")
	public ResponseEntity<List<Curso>> getcursos() {
		List<Curso> lista = cursoService.getCursos();
		return ResponseEntity.ok().body(lista);
	}
	
}
