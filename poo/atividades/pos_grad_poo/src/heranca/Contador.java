package heranca;

public class Contador extends Funcionario {
	
	private String inscricao;
	
	public void setInscricao(String i) {
		this.inscricao = i;
	}
	
	public String getInscricao() {
		return this.inscricao;
	}
	
	public void executarContabilidade() {
		
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Inscrição: " + getInscricao() + "\n");
	}

}
