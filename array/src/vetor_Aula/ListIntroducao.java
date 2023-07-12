package vetor_Aula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntroducao {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("jao");
		list.add("Matheus");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
	
		//for(String x : list) {
		//	System.out.println("O nome é: " + x);
		//}
		
		list.remove("Maria");
		list.removeIf(x -> x.charAt(0) == 'j');
		
		for(String x : list) {
			System.out.println("O nome é: " + x);
		}
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		List<String> result = list.stream().filter(x -> x.charAt(1) == 'a').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println("O nome é: " + x);
		}
		
		String name = list.stream().filter(x -> x.charAt(2) == 'r').findFirst().orElse("false");
		System.out.println(name);
	}

}
