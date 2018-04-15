package abstracao;

public class Televisao extends Aparelho{
	
	public void ligar() {
		try {
			System.out.print("Ligando televisão em ");
			Thread.sleep(1000);
			System.out.print("3");
			Thread.sleep(1000);
			System.out.print(", 2");
			Thread.sleep(1000);
			System.out.println(", 1.");
			System.out.println("Televisão ligada");		
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void desligar() {
		try {
			System.out.print("Desligando televisão em ");
			Thread.sleep(1000);
			System.out.print("3");
			Thread.sleep(1000);
			System.out.print(", 2");
			Thread.sleep(1000);
			System.out.println(", 1.");
			
			System.out.println("Televisão desligada");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void exibir() {
		System.out.println("Televisão está funcionando");
	}
}
