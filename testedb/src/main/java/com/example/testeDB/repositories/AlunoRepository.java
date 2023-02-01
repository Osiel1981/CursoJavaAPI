package com.example.testeDB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeDB.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
	

}
