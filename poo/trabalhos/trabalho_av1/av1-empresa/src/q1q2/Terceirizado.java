package q1q2;

public class Terceirizado extends Funcionario {
	String empresaTercerizadora;
	
	public Terceirizado(String matricula, String nome, String empresaTerceira) {
		super(matricula, nome);
		this.empresaTercerizadora = empresaTerceira;
	}
	
	public void receberValesTransporte() {
		System.out.println("Vales transporte recebidos.");
	}
	
    public void receberValesRefeicao() {
    	System.out.println("Vales refeição recebidos.");
	}
    
    @Override
    public void receberSalario() {
    	System.out.println("Salário do funcionário terceirizado " + getNome() + " recebido.");
    	receberValesTransporte();
    	receberValesRefeicao();
    }
}
