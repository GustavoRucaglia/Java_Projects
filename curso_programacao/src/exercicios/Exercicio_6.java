package exercicios;
import java.util.*;
public class Exercicio_6 {
	
	public static void main(String[] args) {
			
		Scanner tcd = new Scanner(System.in);
		
		double pi = 3.14159;
		double A, B, C;
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		
		System.out.println("escreva o numero 1:");
		A = tcd.nextDouble();
		System.out.println("escreva o numero 2:");
		B = tcd.nextDouble();
		System.out.println("escreva o numero 3:");
		C = tcd.nextDouble();
		
		areaTriangulo = (A * C)/2;
		areaCirculo = pi * Math.pow(C, 2.00);
		areaTrapezio = (( A + B) * C)/2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		System.out.println("Triangulo: " +  areaTriangulo + "\nCirculo: " + areaCirculo + "\nTrapezio: " + areaTrapezio + "\nQuadrado: " + areaQuadrado + "\nRetangulo: " + areaRetangulo);
		
	}
}
