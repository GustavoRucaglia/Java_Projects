package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramBussines {
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<Employee>();
		
		System.out.println("Enter the number of employees: ");
		int numberOfEmployees = tcd.nextInt();
		for(int i = 1; i <= numberOfEmployees; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Outsourced(y/n)?");
			char boolea = tcd.next().charAt(0);
			System.out.println("Name: ");
			String name = tcd.next();
			System.out.println("Hours: ");
			Integer hours = tcd.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = tcd.nextDouble();
			if(boolea != 'n') {
				System.out.println("Additional charge: ");
				Double additionalCharge = tcd.nextDouble();
				Employee o1 = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(o1);
			}else {
				Employee o2 = new Employee(name, hours, valuePerHour);
				employees.add(o2);
			}
		}
		System.out.println("\nPayments: ");
		for(Employee human : employees) {
			System.out.println(human.getName() + " -  $" + human.payment());
		}
	}
}
