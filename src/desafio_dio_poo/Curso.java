package desafio_dio_poo;


public class Curso extends Conteudo{

	private int cargaHoraria;
	
	
	

	public Curso(String titulo, String descricao, int cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso: "+ this.titulo + "\n" + "Descricao: " + "\n" + "Carga Horaria: " + this.cargaHoraria;
				
				
	}


	@Override
	public double calcularXP() {
		return Conteudo.XP_PADRAO * this.cargaHoraria;
	}
	
		
	
	
}
