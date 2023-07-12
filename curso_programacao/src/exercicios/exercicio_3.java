package exercicios;
import java.util.*;
public class exercicio_3 {
	
	
	public static void main(String[] args) {
	
		Scanner tcd = new Scanner(System.in);
		
		//declarações
		
		int A, B, C, D, diferenca;
		
		A = tcd.nextInt();
		B = tcd.nextInt();
		C = tcd.nextInt();
		D = tcd.nextInt();
		
		diferenca = (A * B) - (C * D);
		System.out.println(diferenca);
	}	
}
