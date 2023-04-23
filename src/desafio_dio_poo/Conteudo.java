package desafio_dio_poo;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10;
	
	protected String titulo;
	protected String descricao;
	
	
	public abstract double calcularXP();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
