package desafio_dio_poo;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	// usando set pois o set nao deixa duplicar a entrada
	// sendo assim, o dev pode se inscrever ou concluir apenas uma vez um curso.
	// LinkedHashSet preserva a ordem de insercao do objeto na colecao
	
	
	
	public void inscreverBootcamp(Bootcamp bootcamp) {}
	
	public Dev(String nome) {
		this.nome = nome;
	}
	
	

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	public String getNome() {
		return nome;
	}

	public void progredir() {}
	
	public void calcularTotalXp() {}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos);
	}
	/* Utilizando o metodo equals() e hashCode(), para realizar a comparacao dos elementos inseridos na lista
	 * O metodo hashCode() calcula o valor de hash de um obejto que e um numero inteiro usado pelas colecoes
	 * para identificar a posicao de um objeto dentro de uma lista hash. O metodo hashCode() deve ser imple-
	 * mentado juntamente do equals() para garantir que um mesmo obejto tenham o mesmo valor de hash.
	 */
	
	
}
