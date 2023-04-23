package desafio_dio_poo;

import java.time.LocalDate;
import java.util.Iterator;

public class Main {
	
	public static void main(String args[]) {
		
		Curso curso_java = new Curso("Java","Conceitos de POO",16);
		Curso curso_sql = new Curso("MySQL","Conceitos de banco de dados relacional",24);
		Mentoria mentoria_java = new Mentoria("Aula inaugural entendendo conceitos e sintaxe","Sintaxe Java", LocalDate.of(2023,04,20));
		
		
		Bootcamp bootcamp = new Bootcamp("Java Developer","Spring boot, Banco de dados SQL e NoSQL, Java");
		bootcamp.setConteudos(curso_java);
		bootcamp.setConteudos(curso_sql);
		bootcamp.setConteudos(mentoria_java);
		
		Dev eduardo = new Dev("Eduardo Oliveira");
		Dev amanda = new Dev("Amanda Rodrigues");
		
		amanda.inscreverBootcamp(bootcamp);
		eduardo.inscreverBootcamp(bootcamp);
		
		bootcamp.listarInscritos();
		
		eduardo.progredir();
		eduardo.progredir();
		eduardo.progredir();
		
		System.out.println(eduardo.getConteudosInscritos());
		System.out.println(amanda.getConteudosInscritos());
		
		
		System.out.println(eduardo.getConteudosConcluidos()); 
		System.out.println(" XP: " + eduardo.calcularTotalXp());  
		
		
		
		
		
		
	}

}
