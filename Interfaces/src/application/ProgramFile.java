	package application;
	import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;
	
	public class ProgramFile {
		public static void main(String[] args) {
			List<Employee> list = new ArrayList<>();
			String path = "C:\\Users\\gusta\\OneDrive\\Documentos\\programação\\java\\Interfaces\\in..txt";
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String nameCsv = br.readLine();
				while (nameCsv != null) {
					String[] fields = nameCsv.split(",");
					list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
					nameCsv = br.readLine();
				}
				Collections.sort(list);
				for (Employee s : list) {
					System.out.println(s.getName() + s.getSalary());
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

