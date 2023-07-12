package vetorExercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entides.Employee;

public class ExercicioList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tcd = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be resgistered?");
		int N = tcd.nextInt();
		
		for( int i=0; i < N; i++) {
			System.out.println("employee #" + ( i + 1) + ":");
			System.out.println("id: ");
			Integer id = tcd.nextInt();
			System.out.println("Name: ");
			tcd.nextLine();
			String name = tcd.nextLine();
			System.out.println("Salary: ");
			Double salary = tcd.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		System.out.println("Enter the employee id that will have salary increase:");
		N = tcd.nextInt();
		Integer positionId = positionId(list, N);
		
		if( positionId == null) {
			System.out.println("This id does not exist");
		}else {
			System.out.println("Enter the percentage:");
			int percentage = tcd.nextInt();
			list.get(positionId).increaseSalary(percentage);
		}
		
		System.out.println("List of employees" + list.toString());
		tcd.close();
	}
	
	public  static Integer positionId(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
