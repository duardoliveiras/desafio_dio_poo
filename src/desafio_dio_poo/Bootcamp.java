package desafio_dio_poo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends Conteudo{

	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public Bootcamp(String titulo, String descricao) {
		this.titulo = titulo;
	    this.descricao = descricao;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Dev devsInscritos) {
		
		this.devsInscritos.add(devsInscritos);
	
	}
	public void listarInscritos() {
		System.out.println("Alunos inscritos:");
		Iterator<Dev> iterator = this.devsInscritos.iterator();
		while(iterator.hasNext()) {
			Dev dev = iterator.next();
			System.out.println("Nome: " + dev.getNome());
		}
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Conteudo conteudos) {
		this.conteudos.add(conteudos);
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public double calcularXP() {
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, devsInscritos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(devsInscritos, other.devsInscritos);
	}
	
	

}
