import java.util.Scanner;
import java.util.Locale;

public class Funcoes_aritimetricas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tcd = new Scanner(System.in);
		
		double numero1 = 3.0;
		double numero2 = 4.0;
		double numero3 = -5.0;
		double numero4, numero5, numero6;
		
		// sqrt -> Raiz quadrada
		numero4  = Math.sqrt(numero1);
		numero5  = Math.sqrt(numero2);
		numero6  = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + numero1 + "=" + numero4);
		System.out.println("Raiz quadrada de " + numero2 + "=" + numero5);
		System.out.println("Raiz quadrada de  25"  + "=" + numero6);
		
		// pow -> Potenciação
		numero4 = Math.pow(numero2, numero3);
		numero5 = Math.pow(numero1,  2.0);
		numero6 = Math.pow(5.0, 2.0);
		System.out.println(numero1 + " elevado a " + numero2 + "=" + numero4);
		System.out.println(numero2 + " elevado ao quadrado"  + "=" + numero5);
		System.out.println(" 5 elevado ao quadrado"  + "=" + numero6);
		
		// abs -> valor absoluto
		numero4 = Math.abs(numero2);
		numero5 = Math.abs(numero3);
		System.out.println(numero4);
		System.out.println(numero5);
		
		
		//exemplo de equação de segundo grau
		double delta, x1, x2;
		
		System.out.println("digite o A da equação: ");
		double A = tcd.nextDouble();
		System.out.println("digite o B da equação:");
		double B = tcd.nextDouble();
		System.out.println("digite o C da equação:");
		double C = tcd.nextDouble();
		
		delta = Math.pow(B, 2.00) - 4 * A * C;
		
		if( delta < 0) {
			System.out.println("não existe solução real");
		}else {
		System.out.println("O delta é: " + delta);
		x1 =  (-B + Math.sqrt(delta)) / (2.0 * A);
		x2 = (-B - Math.sqrt(delta)) / (2.0 * A);
		System.out.println("O x1 é: " + x1);
		System.out.println("O x2 é: " + x2);
		}
	}

}
