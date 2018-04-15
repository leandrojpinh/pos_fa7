package q1q2;

public class Funcionario implements Trabalhador {

	private String matricula, nome;	
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public Funcionario(String mat) {		
		setMatricula(mat);
	}
	
	public Funcionario(String mat, String nome) {
		this(mat);
		setNome(nome);
	}
	
	@Override
	public void receberSalario() {
		System.out.println("Salário do funcionário " + getNome() + " recebido.");
	}

	public int getComissao() {
		// TODO Auto-generated method stub
		return 0;
	}
}
