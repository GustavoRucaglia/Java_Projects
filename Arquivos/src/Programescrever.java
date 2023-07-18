import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programescrever {
	
	public static void main(String[] args) {
			
		String[] lines = new String[] {
				"good morning",
				"good Afternoon"
		};
		
		String path = "C:\\Users\\gusta\\OneDrive\\Documentos\\programação\\java\\Arquivos\\criadoPorJava.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
					bw.write(line);
					bw.newLine();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		String path1 = "C:\\Users\\gusta\\OneDrive\\Documentos\\programação\\java\\Arquivos\\teste.txt";
		
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter(path1,true))) {
			for(String line : lines) {
					bw1.write(line);
					bw1.newLine();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

