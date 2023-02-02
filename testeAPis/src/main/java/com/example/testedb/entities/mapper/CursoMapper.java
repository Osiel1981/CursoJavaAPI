package com.example.testeDB.entities.mapper;

import org.springframework.stereotype.Service;

import com.example.testeDB.entities.Curso;
import com.example.testeDB.entities.DTO.CursoDTO;

@Service
public class CursoMapper {
	
	public Curso mapCursoDTOToCurso(CursoDTO dto) {
		Curso curso = new Curso(dto.getName(), dto.getArea());
		return curso;
	}
}
