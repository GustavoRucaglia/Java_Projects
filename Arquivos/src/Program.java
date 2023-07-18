import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\gusta\\OneDrive\\Documentos\\programação\\java\\Arquivos\\teste.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		System.out.println(file.getName());
	}
}
