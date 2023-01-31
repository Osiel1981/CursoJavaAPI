package com.example.testeDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.testeDB.entities.Curso;
import com.example.testeDB.repositories.CursoRepository;

@SpringBootApplication
public class TesteDbApplication implements CommandLineRunner{
	
	@Autowired
	private CursoRepository cursoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteDbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Curso curso1 = new Curso("Graduação em Economia", "Administração");
		Curso curso2 = new Curso("Mestrado em Economia", "Administração");
		Curso curso3 = new Curso("Graduação em biologia", "Ciencias Humanas");
		Curso curso4 = new Curso("Tecnologia em Processos Gerenciais", "Administração");
		
		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		cursoRepository.save(curso4);
		
		
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
		List<String> ConsultaPorAreaInformada = cursoRepository.findbyQueryPorAreaInformada("Ciencias Humanas");
		ConsultaPorAreaInformada.forEach( curso -> System.out.println(curso));
		
		
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
