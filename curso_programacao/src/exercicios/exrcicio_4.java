package exercicios;
import java.util.*;
public class exrcicio_4 {
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		double number, numberHours, salaryForHours, salary;
		
		System.out.println("digite seu numero");
		number = tcd.nextDouble();
		System.out.println("digite as horas trabalhadas:");
		numberHours = tcd.nextDouble();
		System.out.println("digite seu salario por hora trabalhada:");
		salaryForHours = tcd.nextDouble();
		
		salary = numberHours * salaryForHours;
		
		System.out.println("numero: " + number + "\nsalario: " + salary);
		
		
		
	}
}
