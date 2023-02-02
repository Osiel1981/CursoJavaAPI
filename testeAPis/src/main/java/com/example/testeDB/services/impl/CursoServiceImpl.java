package com.example.testeDB.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testeDB.entities.Curso;
import com.example.testeDB.repositories.CursoRepository;
import com.example.testeDB.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public List<Curso> getCursos() {
		
		return cursoRepository.findAll();
	}

	@Override
	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

}
