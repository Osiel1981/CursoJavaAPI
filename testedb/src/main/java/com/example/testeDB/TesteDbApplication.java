package com.example.testeDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.testeDB.entities.Aluno;
import com.example.testeDB.entities.Curso;
import com.example.testeDB.entities.Grade;
import com.example.testeDB.repositories.AlunoRepository;
import com.example.testeDB.repositories.CursoRepository;
import com.example.testeDB.repositories.GradeRepository;

@SpringBootApplication
public class TesteDbApplication implements CommandLineRunner{
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private GradeRepository gradeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteDbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Curso curso1 = new Curso("Graduação em Economia", "Administração");
		Curso curso2 = new Curso("Mestrado em Economia", "Administração");
		Curso curso3 = new Curso("Graduação em biologia", "Ciencias naturais");
		Curso curso4 = new Curso("Tecnologia em Processos Gerenciais", "Administração");
		
		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		cursoRepository.save(curso4);
		
		Aluno aluno1 = new Aluno("Osiel Mesquita",curso2);
		Aluno aluno2 = new Aluno("Joquim Oliveira",curso3);

		
		alunoRepository.save(aluno1);
		alunoRepository.save(aluno2);

		Grade grade1 = new Grade("Ong de animais", aluno2);
		
		gradeRepository.save(grade1);
		
		//List<Curso> listaDeCursos = cursoRepository.findAll();
		//listaDeCursos.forEach(curso -> System.out.println(curso.toString()));
		
		//List<Curso> ListaContendo = cursoRepository.findCursoByNameContaining("Graduação");
		//ListaContendo.forEach(curso -> System.out.println(curso));
		
		//List<Curso> ListaContendoParte = cursoRepository.findCursoByNameLikeIgnoreCase("%GiA%");
		//ListaContendoParte.forEach(curso -> System.out.println(curso));
		
		
	/*	Aqui faço uma consulta no BD usando a inteface cursoRepository 
		 Retornando uma Lista com todos os cursos.
		List<Curso> consultaPorQuery = cursoRepository.findByQuery();
		consultaPorQuery.forEach(curso -> System.out.println(curso));
	*/
		
	/*	
		List<String> cursoPorNomeAreaQuery = cursoRepository.findByQueryNomePorArea();
		cursoPorNomeAreaQuery.forEach( curso -> System.out.println(curso));
	*/
		//List<String> ConsultaPorAreaInformada = cursoRepository.findbyQueryPorAreaInformada("Ciencias Humanas");
		//ConsultaPorAreaInformada.forEach( curso -> System.out.println(curso));
		
		//List<String> consultaPorParametros = cursoRepository.findbyQuerymultiploParametros("Ciencias Humanas", "Graduação em biologia");
		//consultaPorParametros.forEach(curso -> System.out.println(curso));
		
		//alterando os dados do curso2
		//curso2.setNome("Engenharia Química");
		//cursoRepository.save(curso2);
		
		
		
		//Optional<Curso> cursoProcurado = cursoRepository.findById(3);
		
		//System.out.println("Curso procurado: " + cursoProcurado.get());
		
		//deletando curso pelo nome
		//cursoRepository.delete(curso3);
		
		//deletando curso por ID
		//cursoRepository.deleteById(1);
		
		//List<Curso> listaDeCursosDois = cursoRepository.findAll();
		//listaDeCursosDois.forEach(curso -> System.out.println(curso.toString()));
		//System.out.println("Total de cursos: " + cursoRepository.count());
		
		
		//Importante passar o nome do atributo e não do coluna alterada pelo @Colunm()
		//List<Curso> listaPorNome = cursoRepository.findCursoByName("Mestrado em Inclusão e diversidade");
		//listaPorNome.forEach(cursos -> System.out.println("Curso pesquisado por nome"+ cursos));
		
		//System.out.println(listaPorNome);
		
	}

}
