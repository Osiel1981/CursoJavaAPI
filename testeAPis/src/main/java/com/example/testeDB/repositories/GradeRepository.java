package com.example.testeDB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeDB.entities.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer>{
	
}
