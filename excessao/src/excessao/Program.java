package excessao;

import java.util.Scanner;

public class Program {
	
		public static void main(String[] args) {
			
		metodo1();
		}
		public static void metodo1() {
			System.out.println("Metodo 1");
			metodo2();
			
		}
		public static void metodo2() {
		 System.out.println("metodo 2 start");
	Scanner tcd = new Scanner(System.in);
			
			try {
				String[] vect = tcd.nextLine().split(" ");
				int position = tcd.nextInt();
				System.out.println(vect[position]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Digite numero existente");
				e.printStackTrace();
				tcd.next();
			}
			catch( java.util.InputMismatchException e) {
				System.out.println("digite numero");
			};
			tcd.close();
			 System.out.println("metodo 2 end");
		}
}
