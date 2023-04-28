package arrays;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
 * e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

		Scanner input = new Scanner(System.in);
		
		double[] pontoAtividade = new double[5];
		double maior = 0.0;
		
		for(int i = 0; i < pontoAtividade.length; i++){
			System.out.println("Digite o" + (i+1)+ "°ponto");
				pontoAtividade[i] = input.nextDouble();
		}

			for(int i = 0; i < pontoAtividade.length; i++) {
				System.out.println("-> Nota " + pontoAtividade[i]);
				
					if(pontoAtividade[i] > maior){
						maior = pontoAtividade[i];
						}
			}
			
			System.out.println("O maior ponto é:" + maior);
	}
}
