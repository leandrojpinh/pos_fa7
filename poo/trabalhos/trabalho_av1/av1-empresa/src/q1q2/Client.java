package q1q2;

public class Client {

	public static void main(String[] args) {
		//Inicializando Funcionários
		Funcionario f1 = new Funcionario("001", "Leandro Jackson");
		Funcionario f2 = new Funcionario("002", "Carla Valeria");
		Funcionario f3 = new Funcionario("003", "Ronilson Possidonio");
		Funcionario f4 = new Funcionario("004", "Lucas Barros");
		Funcionario f5 = new Funcionario("005", "Kaique Felipe");
		Funcionario f6 = new Funcionario("006", "Ruth Barros");
		Funcionario f7 = new Funcionario("007", "Beatriz Nobre");
		
		Funcionario f8 = new Terceirizado("008", "Caio Renan", "Fluxus");
		Funcionario f9 = new Terceirizado("009", "Mateus Rodrigues", "Fluxus");
		Funcionario f10 = new Terceirizado("010", "Ana Maria", "Ypê");
		Funcionario f11 = new Terceirizado("011", "Jackson", "Google");
		
		//Admitindo funcionarios
		Empresa empresa = new Empresa("Rede");
		empresa.Adimitir(f1);
		empresa.Adimitir(f2);
		empresa.Adimitir(f3);
		empresa.Adimitir(f4);
		empresa.Adimitir(f5);
		empresa.Adimitir(f6);
		empresa.Adimitir(f7);
		empresa.Adimitir(f8);
		empresa.Adimitir(f9);
		empresa.Adimitir(f10);
		empresa.Adimitir(f11);
		
		empresa.Demitir("008");
		
		empresa.Pagar();
	}
}
