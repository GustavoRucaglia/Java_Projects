import java.io.File;
import java.util.Scanner;

public class ProgramCaminhos {
	
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Enter a file path");
		String strPath = tcd.nextLine();
		
		File path = new File(strPath);
		
		System.out.println(path.getParent());
		System.out.println(path.getAbsoluteFile());
	}
}
