package q4;

public class NaoMultiploDe3Exception extends Exception {
	
	private int linha, coluna;
	
	public int getColuna() {
		return coluna;
	}
	
	public int getLinha() {
		return linha;
	}
	
	public NaoMultiploDe3Exception(int linha, int coluna) {
		super("Erro: elemento nao eh multiplo de 3!");
		this.linha = linha;
		this.coluna = coluna;
	}
}
