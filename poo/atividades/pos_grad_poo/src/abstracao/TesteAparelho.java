package abstracao;

public class TesteAparelho {
	
	public static void main(String[] args) {
		Aparelho tv = new Televisao();
		Aparelho mo = new Microondas();
		
		tv.ligar();
		tv.desligar();
		tv.exibir();
		
		mo.ligar();
		mo.desligar();
		mo.exibir();
	}
}
