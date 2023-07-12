package vetorExercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
			Scanner tcd = new Scanner(System.in);
			
			System.out.println("Quantos numeros você vai digitar?");
			int qtd = tcd.nextInt();
			int[] n = new int[qtd];
			
			for(int i  = 0; i < n.length; i++) {
				System.out.println("Digite um numero: ");
				n[i] = tcd.nextInt();
			}
			
			System.out.println("Numeros negativos");
			for(int i = 0; i < n.length; i++) {
				if(n[i] < 0) {
					System.out.println(n[i]);
				}
			}
			
			tcd.close();
	
	}

}
