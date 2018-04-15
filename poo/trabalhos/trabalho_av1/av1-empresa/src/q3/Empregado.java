package q3;

public class Empregado {	
	private String nome, matricula;
	private double salario, salarioLiquido;
	private int comissao;
	
	public Empregado(String nome, String matricula, double salarioL, int comissao) {
		setNome(nome);
		setMatricula(matricula);
		setSalarioLiquido(salarioL);
		setComissao(comissao);
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public int getComissao() {
		return comissao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setSalarioLiquido(double sl) {
		this.salarioLiquido = sl;
	}
	
	public void setSalario(double s) {
		this.salario = s;
	}
	
	public void setComissao(int c) {
		this.comissao = c;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setMatricula(String m) {
		this.matricula = m;
	}
}
