package vetor_Aula;

import java.util.Locale;
import java.util.Scanner;

public class Program {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			
			Scanner tcd = new Scanner(System.in);
			
			int n = tcd.nextInt();
			
			double[] vect = new double [n];
			for( int i = 0; i < n; i++) {
				vect[i] = tcd.nextInt();
			}
			double sum = 0;
			for(int i =0; i < n; i++) {
				sum += vect[i];
				}
			    double avg = sum / n;
			    System.out.printf("AVARANGe HEIGHT: %2.f%n", + avg);
			tcd.close();
		}
}
