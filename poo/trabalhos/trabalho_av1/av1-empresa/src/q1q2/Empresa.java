package q1q2;
import java.util.ArrayList;

public class Empresa {
	private String nome;
	private ArrayList<Funcionario> listaTrabalhadores= new ArrayList<Funcionario>();
	private static int countTerceirizado = 0;
	private static float percentTerceirizado = 0; 
	
	public ArrayList<Funcionario> getFuncionarios() {
		return this.listaTrabalhadores;
	}
	
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	public void Adimitir(Funcionario f) {		
		if(PermiteAdimitir(f)) {
			if(f != null) {
				getFuncionarios().add(f);
				System.out.println("Funcion�rio adimitido.");
			}else
				System.out.println("Funcion�rio sem dados.");
		} else
			System.out.println("J� foi atingido o limite funcion�rios terceirizados.");
	}
	
    public void Demitir(String matricula) {
    	Funcionario funcionario = null;
    	for(Funcionario f : getFuncionarios()) {
    		if(f.getMatricula().equals(matricula)) {
    			funcionario = f;
    			break;
    		}
    	}
    	
    	if(funcionario != null) {
    		getFuncionarios().remove(funcionario);
    		System.out.println("Funcion�rio: " + funcionario.getNome() + " foi Demitido.");
    	} else
    		System.out.println("Funcion�rio n�o encontrado.");
	}
    
    public void Pagar() {
    	for(Funcionario f : getFuncionarios())
    		f.receberSalario();
    }
    
    private boolean PermiteAdimitir(Funcionario f) {
    	int total = getFuncionarios().size();
    	float percent = (float)(total * 30)/100;    	

    	if(f.getClass().getName() == "Terceirizado") {
    		if(percent > countTerceirizado) {
    			countTerceirizado++;
    			return true;
    		}
    		return false;    		
    	}
    	return true;
    }
}
