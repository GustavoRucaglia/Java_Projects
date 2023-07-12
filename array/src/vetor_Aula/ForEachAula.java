package vetor_Aula;

public class ForEachAula {

	public static void main(String[] args) {
		String[] vect = new String[] {"maria", "joão", "bob", "alex"};
		
		for(String obj : vect) {
			System.out.println("O nome é: " + obj);
		}
	}
}
