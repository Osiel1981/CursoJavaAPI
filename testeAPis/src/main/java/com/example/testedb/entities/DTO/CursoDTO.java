package com.example.testeDB.entities.DTO;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CursoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotNull(message = "Nome não pode ser nulo.")
	@NotEmpty(message = "O nome deve ser preenchido.")
	@Size(min = 3, max = 30)
	private String nome;
	
	@NotBlank
	private String area;
	
	public CursoDTO() {
	}
	
	public CursoDTO(Integer id, String nome, String area) {
		super();
		this.id = id;
		this.nome = nome;
		this.area = area;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	

}
