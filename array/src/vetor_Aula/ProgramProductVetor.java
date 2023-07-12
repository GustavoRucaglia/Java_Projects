package vetor_Aula;

import java.util.Locale;
import java.util.Scanner;

import entides.Product;

public class ProgramProductVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tcd = new Scanner(System.in);
		
		int n = tcd.nextInt();
		Product[] vect = new Product[n];
		
		for( int i =0; i < n; i++) {
			tcd.nextLine();
			String name = tcd.nextLine();
			double price = tcd.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		
		for( int i =0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		System.out.println("AVARAGE PRICE = " + avg);
		
		tcd.close();

	}

}
