package com.example.testeDB.services;

import java.util.List;

import com.example.testeDB.entities.Curso;

public interface CursoService {
	public List<Curso> getCursos();

	public Curso save(Curso curso);
}
