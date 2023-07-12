package exercicios;
import java.util.*;

public class exercicio_5 {
	public static void main(String[] args) {
	
	 Scanner tcd = new Scanner(System.in);
	 
	 //declarações
	 double codeID1, numberParts1, valueUnitary1;
	 double codeID2, numberParts2, valueUnitary2, valueTotal;
	 
	 System.out.println("Codigo do produto:");
	 codeID1 = tcd.nextDouble();
	 System.out.println("numeros de peças:");
	 numberParts1 = tcd.nextDouble();
	 System.out.println("valor unitário:");
	 valueUnitary1 = tcd.nextDouble();
	 
	 System.out.println("Codigo do produto:");
	 codeID2 = tcd.nextDouble();
	 System.out.println("numeros de peças:");
	 numberParts2 = tcd.nextDouble();
	 System.out.println("valor unitário:");
	 valueUnitary2 = tcd.nextDouble();
	 
	 valueTotal = (valueUnitary1 * numberParts1) + (valueUnitary2 * numberParts2);
	 System.out.println("valor a pagar:" + valueTotal);
	 
	}	
}
