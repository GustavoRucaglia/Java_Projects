package aplication;

import entities.Accont;
import entities.BusinessAccont;
import entities.SavingsAccont;

public class Program {
	
	public static void main(String[] args) {
		
		//Accont acc = new Accont("guga", 1001, 0.1);
		//BusinessAccont bacc = new BusinessAccont("mari", 1002, 50.0, 100.0);
		
		//UPCASTING
		
		//Accont acc1 = bacc;
		Accont acc2 = new BusinessAccont("bob", 1003, 0.0, 200.0);
		Accont acc3 = new SavingsAccont("Anna", 1003, 0.0, 200.0);
		
		// DOWNCASTING
		
		BusinessAccont acc4 = (BusinessAccont)acc2;
		acc4.loan(100.0);
		
		//BusinessAccont acc5 = (SavingsAccont)acc3;
		if( acc3 instanceof BusinessAccont) {
			BusinessAccont acc5 = (BusinessAccont)acc3;
			System.out.println("Loan" + acc5);
		}
		if( acc3 instanceof SavingsAccont) {
			//SavingsAccont acc5 = (SavingsAccont)acc3;
			//System.out.println("upthade" + acc5);
		}
		
		//Accont acc1 = new Accont("guga", 1001, 100.00);
		//acc1.withdraw(100.0);
		//System.out.println(acc1.getBalence());
		
		Accont acc21 = new SavingsAccont("yas", 1003, 100.00, 0.01);
		acc21.withdraw(100.0);
		System.out.println(acc21.getBalence());
		
		Accont acc31 = new BusinessAccont("ju", 1009, 100.0, 50.0);
		acc31.withdraw(100);
		System.out.println(acc31.getBalence());
	}
}
