package q4;

public class MultiplosDe3 {
	
	public static void testarMultiplo3(int [][] numeros) throws NaoMultiploDe3Exception {
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
				if((numeros[i][j] % 3) == 0)
					System.out.println("O número " + numeros[i][j] + " é múltiplo de 3!");
				else
					throw new NaoMultiploDe3Exception(i, j);
			}
		}
	}
	
	public static void main(String[] args) {
		int matrix[][] = new int [][] {
			{3, 6, 9, 12},
			{15, 14, 27, 35},
			{60, 90, 120, 150}
		};
		
		imprimirMatrix(matrix);
		
		try {
			testarMultiplo3(matrix);
		} catch (NaoMultiploDe3Exception e) {
			System.out.println(e.getMessage() + "\nLinha: " + e.getLinha() + "\nColuna: " + e.getColuna());
		} catch (Exception e) {
			System.out.println("Erro desconhecido: " + e.getMessage());
		}
	}

	private static void imprimirMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			System.out.print(" { ");
			for(int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.print("} ");
			System.out.println("");
		}
	}
}
