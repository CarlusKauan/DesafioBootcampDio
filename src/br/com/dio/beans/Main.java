package br.com.dio.beans;

import java.time.LocalDate;

import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso c1 = new Curso();
		c1.setTitulo("Desenvolvimento Java");
		c1.setDescricao("Apredendo java !");
		c1.setCargaHoraria(10);
		
		System.out.println(c1);
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Professora Camila Mendes");
		m1.setDescricao("Formada em 2003 em TI");
		m1.setData(LocalDate.now());
		
		System.out.println(m1);

	}
}
