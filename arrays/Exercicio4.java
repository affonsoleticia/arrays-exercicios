package arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e 
 * a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */

		Scanner input = new Scanner(System.in);
		
		int somaMatriz = 0, somaDiagonal = 0;
		int[][] matriz = new int [3][3];
		
		for(int i = 0; i < matriz.length; i++){
			for(int x = 0; x < matriz.length; x++){

				System.out.println("Digite um valor para a posição [" + i + "] ["+ x + "]:");
				matriz[i][x] = input.nextInt();
					
					somaMatriz = somaMatriz+ matriz[i][x];
					
					if (matriz[i] == matriz[x]) {
						
						somaDiagonal = somaDiagonal + matriz[i][x];
					}
			}
		}

		System.out.println("A soma dos valores da matriz é: "+somaMatriz+". E a soma dos valores da diagonal principal é: " + somaDiagonal);
	}

}
