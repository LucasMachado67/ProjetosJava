package Main;

import java.time.LocalDate;
import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class main {

	public static void main(String[] args) {
		
		
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição curso Java");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricão de mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*
		 * System.out.println(curso); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudo().add(curso);
		bootcamp.getConteudo().add(curso2);
		bootcamp.getConteudo().add(mentoria);
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + devLucas.getConteudosInscritos());
		devLucas.progredir();
		devLucas.progredir();
		System.out.println("-");		
		System.out.println("Conteúdos inscritos: " + devLucas.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + devLucas.getConteudosConcluidos());
		System.out.println("XP: " + devLucas.calcularTotalXp());
		
		System.out.println("---------------");		
				
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");		
		System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
		
		
		
	}

}
