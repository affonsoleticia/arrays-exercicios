package arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere 
 * um vetor com os lançamentos,escreva esse vetor. A seguir determine e imprima a média aritmética
dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */

Scanner input = new Scanner(System.in);
		
		int[] dado = new int [10];
		int contabilizar =0,maior=0, cont = 0;
		double media = 0.00;
		
		for(int i = 0; i < dado.length; i++){
			System.out.println("Digite o valor do " + (i+1)+ "°lançamento:");
			dado[i] = input.nextInt();
			}
		 
			for(int i = 0; i < dado.length; i++){
			System.out.println("-> Valor de cada Lançamento " + dado[i]);
			
				if(dado[i] > maior){
					maior = dado[i];
				}
			}	
					for(int i = 0; i < dado.length; i++) {
						contabilizar += dado[i];
						media = contabilizar / 10;
						}
		
						for(int i = 0; i < dado.length; i++) {
							if(dado[i] == maior) {
								cont++;
								}
							}
						
		System.out.println("A contabilização dos lançamentos é:" + contabilizar);
		System.out.println("A média de lançamentos é:" + media);
		System.out.println("O maior lançamento é:" + maior + ", e a qtd de ocorrência dele é:" + cont);		
	}
}
