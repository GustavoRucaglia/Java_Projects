package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.ConsumerTeste;
import util.UperCaseName;

public class ProgramFunction {
		public static void main(String[] args) {
			
			List<Product> list = new ArrayList<>();
			
			list.add(new Product("Tvq", 900.00));
			list.add(new Product("Mouse", 50.00));
			list.add(new Product("Tablet", 350.50));
			list.add(new Product("HD Case", 80.90));
			
			list.forEach(new ConsumerTeste());
			Function<Product,String> fuc = p -> p.getName().toUpperCase();
			
			List<String> names = list.stream().map(fuc).collect(Collectors.toList());
			
			names.forEach(System.out::println);
			

		}
}
