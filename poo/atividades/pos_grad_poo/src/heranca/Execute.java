package heranca;

import java.sql.Date;

public class Execute {
	
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Funcionario");
		func.setMatricula("02030301");
		func.setSexo('M');
		func.setDataNascimento(new Date(1996, 11, 14));
		func.setRecebeSalario(true);
		
		func = new Professor();
		func.setNome("Leandro Jackson");
		func.setMatricula("02030301");
		func.setSexo('M');
		func.setDataNascimento(new Date(1996, 11, 14));
		func.setRecebeSalario(true);		
		func.exibirDados();
		
		func = new Coordenador();
		func.setNome("Coordenadora");
		func.setMatricula("00212000");
		func.setSexo('F');
		func.setDataNascimento(new Date(2000, 11, 14));
		func.setRecebeSalario(false);
		func.exibirDados();
		
		func = new Contador();
		func.setNome("Contador");
		func.setMatricula("4568784");
		func.setSexo('F');
		func.setDataNascimento(new Date(2000, 11, 14));		
		func.setRecebeSalario(false);
		func.exibirDados();
		
	}
}
