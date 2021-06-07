package Lista04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		double valores = 0.0;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[(int) l].length; c++) {
				System.out.printf("\nInsira os valores: [%d] [%d]", l, c);
				matriz[l][c] = ler.nextDouble();
				
				if(matriz[l][c] > 10) {
					valores++;
				}
			}
		}
		
		System.out.println("\nVocê inseriu " + valores + " valores acima de 10.");
		ler.close();
	}

}
