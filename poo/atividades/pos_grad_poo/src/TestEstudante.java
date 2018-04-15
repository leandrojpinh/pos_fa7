
public class TestEstudante {
	
	public static void main(String[] args) {
		
		/*###Atividade 1 e 2###
		Estudante est = new Estudante();
		
		est.matricula = 2004001;
		est.nome = "Leandro Jackson";
		est.sexo = 'M';
		
		est.atribuirNota(1, 7);
		est.atribuirNota(2, 8.2);
		est.atribuirNota(3, 6);
		est.atribuirNota(4, 5.5);
		
		est.exibir();
		
		System.out.println("\nNotas");
		for(int i = 0; i < est.notas.length; i++)
			System.out.println(est.lerNota(i));
		
		est.mediaNota();
		
		*/
		
		/*Exercicio 4
		Estudante est = new Estudante();
		est.setNota(1, 7);
		est.setNota(2, 5);
		est.setNota(3);
		est.setNota(4, 8.5);
		
		est.exibir();
		
		est.exibir("Dados do estudante");
		
		Estudante est2 = new Estudante("Lejapinh", 'M');
		est2.setNota(1, 8);
		est2.setNota(2, 6);		
		est2.setNota(3, 9);
		est2.setNota(4);
		
		est2.exibir();
		
		est2.exibir("Dados do estudante");		
		
		Estudante est3 = new Estudante("Nascimento", 'M', 23456);
		est3.setNota(1, 5);
		est3.setNota(2, 7);		
		est3.setNota(3, 3);
		est3.setNota(4);
		
		est3.exibir();
		
		est3.exibir("Dados do estudante");*/
		
		Estudante est = new Estudante();
		est.setNota(1, 7);
		est.setNota(2, 5);
		est.setNota(3);
		est.setNota(4, 8.5);
		
		est.exibir();
		
		est.exibir("Dados do estudante");
		Estudante.exibirEstudantes();
		
		Estudante est2 = new Estudante("Leandro", 'M');
		est2.setNota(1, 8);
		est2.setNota(2, 6);		
		est2.setNota(3, 9);
		est2.setNota(4);
		
		est2.exibir();
		
		est2.exibir("Dados do estudante");
		Estudante.exibirEstudantes();
		
		Estudante est3 = new Estudante("Nascimento", 'M', 23456);
		est3.setNota(1, 5);
		est3.setNota(2, 7);		
		est3.setNota(3, 3);
		est3.setNota(4);
		
		est3.exibir();
		
		est3.exibir("Dados do estudante");
		
		Estudante.exibirEstudantes();
	}
}
