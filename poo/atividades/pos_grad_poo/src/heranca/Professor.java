package heranca;

public class Professor extends Funcionario {
	
	private int numeroHorasAula;
	private boolean leciona;
	
	public Professor() {
		
	}
	
	public int getNumeroHorasAula() {
		return numeroHorasAula;
	}

	public void setNumeroHorasAula(int numeroHorasAula) {
		this.numeroHorasAula = numeroHorasAula;
	}

	public boolean isLeciona() {
		return leciona;
	}

	public void setLeciona(boolean leciona) {
		this.leciona = leciona;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Número de horas aula: " + getNumeroHorasAula() + "\n"
				+ "Leciona: " + (isLeciona() ? "Sim" : "Não"));
		
	}
}
