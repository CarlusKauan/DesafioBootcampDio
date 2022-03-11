package br.com.dio.beans;

import java.time.LocalDate;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso c1 = new Curso();
		c1.setTitulo("Desenvolvimento Java");
		c1.setDescricao("Apredendo java !");
		c1.setCargaHoraria(10);
		
		Curso c2 = new Curso();
		c2.setTitulo("Banco de dados");
		
		System.out.println(c1);
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Professora Camila Mendes");
		m1.setDescricao("Formada em 2003 em TI");
		m1.setData(LocalDate.now());
		
		System.out.println(m1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(c1);
		bootcamp.getConteudos().add(c2);
		bootcamp.getConteudos().add(m1);
		
		System.out.println("\n----------");
		
		// new
		Dev devCarlos = new Dev();
		devCarlos.setNome("Carlos Kauan");
		devCarlos.setIdade(18);
		devCarlos.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Carlos Kauan: " + devCarlos.getConteudosInscritos());
		devCarlos.progredir();
		System.out.println("Conteúdos Inscritos Carlos Kauan: " + devCarlos.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Carlos Kauan: " + devCarlos.getConteudosConcluidos());
		System.out.println("XP:" + devCarlos.calcularTotalXp());
		
		System.out.println("\n----------");
		
		// new
		Dev devKewen = new Dev();
		devKewen.setNome("Carlos Kewen");
		devKewen.setIdade(12);
		devKewen.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Carlos Kewen: " + devKewen.getConteudosInscritos());
		devKewen.progredir();
		devKewen.progredir();
		devKewen.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Carlos Kewen: " + devKewen.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Carlos Kewen: " + devKewen.getConteudosConcluidos());
		System.out.println("XP:" + devKewen.calcularTotalXp());
		
	}
}
