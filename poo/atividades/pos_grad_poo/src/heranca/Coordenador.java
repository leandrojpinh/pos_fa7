package heranca;

public class Coordenador extends Professor {
	
	private String cargo;
	
	public Coordenador() {
		
	}
	
	public void setCargo(String c) {
		this.cargo = c;
	}
	
	public String getCargo(){
		return this.cargo;
	}
	
	public void criarTurma() {
		
	}
	
	public void exibirDados() {
		super.exibirDados();
		
		System.out.println("Cargo: " + getCargo());
	}
}
