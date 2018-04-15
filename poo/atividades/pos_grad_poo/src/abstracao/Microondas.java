package abstracao;

public class Microondas extends Aparelho {
	
	public void ligar() {
		try {
			System.out.print("Ligando Microondas em ");
			Thread.sleep(1000);
			System.out.print("3");
			Thread.sleep(1000);
			System.out.print(", 2");
			Thread.sleep(1000);
			System.out.println(", 1.");
			System.out.println("Microondas ligado");		
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void desligar() {
		try {
			System.out.print("Desligando Microondas em ");
			Thread.sleep(1000);
			System.out.print("3");
			Thread.sleep(1000);
			System.out.print(", 2");
			Thread.sleep(1000);
			System.out.println(", 1.");
			System.out.println("Microondas desligado");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
