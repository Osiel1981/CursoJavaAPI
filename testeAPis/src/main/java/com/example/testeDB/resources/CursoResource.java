package com.example.testeDB.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testeDB.entities.Curso;
import com.example.testeDB.services.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoResource {
	
	@Autowired
	private CursoService cursoService;
	
	//Metodo GetMapping com responseEntity.ok().body(parametro)
	@GetMapping("/lista")
	public ResponseEntity<List<Curso>> getcursos() {
		List<Curso> lista = cursoService.getCursos();
		return ResponseEntity.ok().body(lista);
	}
	
	@PostMapping("/salva")
	public ResponseEntity<Curso> saveCurso(@RequestBody Curso curso) throws URISyntaxException{
		Curso novoCurso = cursoService.save(curso);
		return ResponseEntity.created(new URI("/curso/salvar/"+ novoCurso.getId())).body(novoCurso);
	}
	
	
}
