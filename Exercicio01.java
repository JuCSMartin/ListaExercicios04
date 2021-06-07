package Lista04;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[] A = new int[6];
		int soma = 0;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		soma = soma + A[0] + A[1] + A[5];
		A[4] = 100;
		
		for(int i = 0; i <=5; i++) {
			System.out.println("Posição " + i + " - " + A[i]);
		}
		
		System.out.println("A soma das posições 0 + 1 + 5 = " + soma);
	}
}