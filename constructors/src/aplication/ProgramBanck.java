package aplication;

import java.util.Locale;
import java.util.Scanner;

import entides.Banck;

public class ProgramBanck {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Enter accont number:");
		int accontNumber = tcd.nextInt();
		System.out.println("Enter accont holder: ");
		String holder = tcd.next();
		Banck accont1 = new Banck( accontNumber, holder);
		
		System.out.println("Is there na initial deposit (y/n)?");
		char bollean = tcd.next().charAt(0);
		
		if(bollean == 'y' || bollean == 'Y') {
			System.out.println("Enter initial deposit value: ");
			double depositValue = tcd.nextDouble();
			accont1.setBalance(depositValue);
		}else {
			System.out.println("foi outro");
		}
		
		System.out.println("Accont data:" + accont1);
		
		System.out.println("Enter a deposit value:");
		double value = tcd.nextDouble();
		accont1.depositBalance(value);
		
		System.out.println("Enter a withdraw value:");
		value = tcd.nextDouble();
		accont1.withdrawBalance(value);
	}

}
