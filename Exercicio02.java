package Lista04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int soma = 0, qntimpar = 0;
		
		for(int i = 0; i <=5; i++) {
			System.out.println("Insira um valor: ");
			vetor[i] = ler.nextInt();
			
			if(vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
			}
			else {
				qntimpar++;
			}
		}
			System.out.printf("\nNúmeros pares: ");
			
			for(int i = 0; i <=5; i++) {
				if(vetor[i] % 2 == 0 ) {
					System.out.printf("| %d |", vetor[i]);
				}
				}
			
			System.out.printf("\nNúmeros ímpares: ");
			
			for(int i = 0; i <= 5; i++) {
				if(vetor[i] % 2 != 0) {
					System.out.printf("| %d |", vetor[i]);
				}
			}
			
			System.out.printf("\nA soma dos números pares: " + soma);
			System.out.printf("\nA quantidade de números ímpares digitados é: %d", qntimpar);
			ler.close();
		}
	}