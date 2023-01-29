package com.example.testeDB.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Usado para salvar a entitidade no Banco de dados
@Table(name = "curso_java") // Usado para mapear o nome da tabela
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome_do_curso")
	private String name;
	
	@Column(nullable = false)
	private String area;

	public Curso() {
	}
		
	public Curso(String name, String area) {
		super();
		this.name = name;
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", name=" + name + ", area=" + area + "]";
	}
	
	
	
}
