package com.example.testeDB.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	
	@CreationTimestamp
	@Column(name = "data_criacao")
	private LocalDateTime dataDeCriacao;
	
	@UpdateTimestamp
	@Column(name = "data_atualizacao")
	private LocalDateTime dataDeAtualizacao;
	
	public Curso() {
	}
	
	//um  para muitos, inverte a posição e leva em conta a classe e não a variavel
	@OneToMany(mappedBy = "curso") // Esse recurso mapea o recurso instaciado na outra classe.
	private List<Aluno> aluno = new ArrayList<>();
		
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

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", name=" + name + ", area=" + area + "]";
	}
	
	
	
}
