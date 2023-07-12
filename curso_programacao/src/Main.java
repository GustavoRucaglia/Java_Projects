//importações

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//declarações
		double x; 
		char y; 
		String nome;
		
		
		//entrada de dados
		
		y = sc.next().charAt(0);
		x = sc.nextDouble();
		nome = sc.nextLine();
		System.out.printf("o numero digitado é %.2f%n", x);
		System.out.println(y);
		
		
		sc.close();
	}

}
