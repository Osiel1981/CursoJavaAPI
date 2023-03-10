package com.example.testeDB.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.testeDB.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

	// Neste método faço uma consulta pelo nome completo.
	List<Curso> findCursoByName(String name);

	// não importa a String usado na assinatura, só não pode ficar em branco. nesse
	// metodo fazemos uma busca em Curso.java, pelo atributo name, contendo uma
	// String de retorno.
	List<Curso> findCursoByNameContaining(String name);
	
	//Quando usamos o Like, precisamos inserir os valores entre "%valor%".
	//Se %valor -> será tudo que termina com valor, e valor% <- será tudo que inicia com valor.
	List<Curso> findCursoByNameLikeIgnoreCase(String name);
	
	
	//consulta usando a anotation @Query selecionando nomes do curso de curso.
	//Retornando todos os cursos. findByQuery precisa ser o nome da funcão
	@Query(value = "select c nome_do_curso From Curso c")
	List<Curso> findByQuery();
	
	//Consulta para retornar lista de "nome_do_curso", da tabela curso_java, que atenderem ao where. usando native Query.
	@Query(value = "select nome_do_curso from curso_java where area = 'Administração'", nativeQuery = true)
	List<String> findByQueryNomePorArea();

	//Usei nativeQuery com @Param(parametro) e assinatura) levando em consideração o area= :area
	@Query(value = "select nome_do_curso from curso_java where area = :area", nativeQuery = true)
	List<String> findbyQueryPorAreaInformada(@Param("area")String area);
	
	//Usei nativeQuery com @Param(parametro) e assinatura) levando em consideração o area= :area
	@Query(value = "select nome_do_curso from curso_java where area = ?1 and nome_do_curso = ?2", nativeQuery = true)
	List<String> findbyQuerymultiploParametros(String area, String nome_do_curso);
}
