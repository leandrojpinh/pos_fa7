package heranca;

import java.sql.Date;

public class Funcionario {
	
	private String nome;
	private String matricula;
	private char sexo;
	private Date dataNascimento;
	private boolean recebeSalario;
	
	public Funcionario() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isRecebeSalario() {
		return recebeSalario;
	}

	public void setRecebeSalario(boolean recebeSalario) {
		this.recebeSalario = recebeSalario;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + getNome() + "\n"
				+ "Matrícula" + getMatricula() + "\n"
				+ "Sexo: " + getSexo() + "\n"
				+ "Data nascimento: " + getDataNascimento() + "\n"
				+ "Recebe salário: " + (isRecebeSalario() ? "Sim" : "Não"));
	}
}
