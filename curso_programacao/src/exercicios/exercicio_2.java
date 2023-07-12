package exercicios;
import java.util.Scanner;
public class exercicio_2 {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		//declarações
		double pi = 3.14;
		double area, raio;
		
		System.out.println("Qual é o raio do círculo?");
		raio = tcd.nextDouble();
		
		area =  pi * (Math.pow(raio, 2.00));
		System.out.println("Area: " + area);
				

	}

}
