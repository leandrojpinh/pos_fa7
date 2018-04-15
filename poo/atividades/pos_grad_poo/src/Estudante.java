

public class Estudante {
	private static int numEstudantes = 0;
	private int matricula;
	private String nome;
	private char sexo;
	private double notas[] = new double[4];
	
	public Estudante() {
		setMatricula(12345);
		setNome("Leandro Jackson");
		setSexo('M');
		
		numEstudantes++;
	}
	
	public Estudante(String nome, char sexo) {
		setNome(nome);
		setSexo(sexo);
		numEstudantes++;
	}

	public Estudante(String nome, char sexo, int matricula) {
		setNome(nome);
		setSexo(sexo);
		setMatricula(matricula);
		numEstudantes++;
	}
	
	public void setMatricula(int m) {
		this.matricula = m;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSexo(char s){
		this.sexo = s;
	}
	
	public char getSexo(){
		return sexo;
	}
	
	public double[] getNotas(){
		return notas;
	}
	
	public void setNota(int numProva, double nota) {
		getNotas()[numProva-1] = nota;
	}
	
	void setNota(int numProva) {
		getNotas()[numProva-1] = 0.00;
	}
	
	double getNota(int numProva) {
		return getNotas()[numProva];
	}
	
	public void exibir() {
		System.out.println("\nMatrícula: " + getMatricula()
				+ "\nNome: " + getNome() 
				+ "\nSexo: " + getSexo());
		
		exibirNota();
	}
	
	public void exibir(String titulo) {
		System.out.println("-----" + titulo + "-----");
		exibir();
	}

	public void mediaNota() {
		double soma = 0;
		for(int i = 0; i < getNotas().length; i++) 
			soma += getNotas()[i];
		
		System.out.println("\nA média do(a) aluno(a) é " + soma/4);
	}
	
	private void exibirNota() {
		for(int i = 0; i < getNotas().length; i++)
			System.out.println("Nota " + (i + 1) + ": " + getNota(i));
	}
	
	public static int getNumEstudantes() {
		return numEstudantes;
	}
	
	public static void exibirEstudantes() {
		System.out.println("\nNuméro de estudantes é " + getNumEstudantes());
	}
}
