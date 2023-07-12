package aplication;

import java.util.Locale;
import java.util.Scanner;

import entides.Product;

public class ProgramConstructor {


		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			
			Scanner tcd = new Scanner(System.in);
			
			System.out.println("Enter product data:");
			System.out.println("Name:");
			String name = tcd.nextLine();
			System.out.println("Price:");
			double price = tcd.nextDouble();
			
			Product product = new Product(name, price);
			
			System.out.println("\nProduct data: " + product);
			
			System.out.println("\nEnter the number of products to be added in stock: ");
			int quantidade = tcd.nextInt();
			product.addProducts(quantidade);
			
			System.out.println("\nUpdated data: " + product);
			System.out.println("\nEnter the number of products to be remove in stock: ");
			quantidade = tcd.nextInt();
			product.removeProducts(quantidade);
			System.out.println("\nUpdated data: " + product);
			
			tcd.close();
		}
}
