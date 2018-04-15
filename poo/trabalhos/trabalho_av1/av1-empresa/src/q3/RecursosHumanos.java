package q3;

import java.util.ArrayList;

public class RecursosHumanos implements Runnable {
	
	public RecursosHumanos() {
		preencheArray();
	}
	
	private ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();
	
	public ArrayList<Empregado> getEmpregados() {
		return this.listaEmpregados;
	}
	
	@Override
	public void run() {
		int countComissao = 0;
		for(Empregado e : getEmpregados()) {
			if(e.getComissao() < 20)
				countComissao++;
		}
		
		System.out.println("THREAD1: A quantidade de Empregados que ganham comissão abaixo de 20% é " + countComissao);
	}
	
	public static void main(String[] args) {
		RecursosHumanos rhFilha = new RecursosHumanos();
		Thread tFilha = new Thread(rhFilha);
		tFilha.start();
		
		RecursosHumanos rhPrincipal = new RecursosHumanos();
		rhPrincipal.calcularSalarios();
	}
	
	private void preencheArray() {

		Empregado e1 = new Empregado("Empregado 1", "001", 1.500, 30);
		Empregado e2 = new Empregado("Empregado 2", "002", 1.500, 40);
		Empregado e3 = new Empregado("Empregado 3", "003", 2.000, 19);
		Empregado e4 = new Empregado("Empregado 4", "004", 2.500, 10);
		Empregado e5 = new Empregado("Empregado 5", "005", 3.500, 30);
		Empregado e6 = new Empregado("Empregado 6", "006", 1.000, 80);
		Empregado e7 = new Empregado("Empregado 7", "007", 1.500, 50);
		Empregado e8 = new Empregado("Empregado 8", "008", 1.200, 45);
		Empregado e9 = new Empregado("Empregado 9", "009", 1.500, 15);
		Empregado e10 = new Empregado("Empregado 10", "010", 900, 70);
		
		getEmpregados().add(e1);
		getEmpregados().add(e2);
		getEmpregados().add(e3);
		getEmpregados().add(e4);
		getEmpregados().add(e5);
		getEmpregados().add(e6);
		getEmpregados().add(e7);
		getEmpregados().add(e8);
		getEmpregados().add(e9);
		getEmpregados().add(e10);
	}
	
	private void calcularSalarios() {
		double totalSalarios = 02.f;
		
		for(Empregado e : getEmpregados()) {			
			e.setSalario(e.getSalarioLiquido() + ( (e.getSalarioLiquido() * e.getComissao()) / 100 ));			
			totalSalarios += e.getSalario();
		}
		
		System.out.println("THREAD2: O Total dos salários para " + getEmpregados().size() + " Empregados é R$ " + String.format("%.2f", totalSalarios));
	}
}
