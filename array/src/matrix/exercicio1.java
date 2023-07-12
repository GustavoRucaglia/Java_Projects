package matrix;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		int line = tcd.nextInt();
		int colum = tcd.nextInt();
		
		int[][] mat = new int[line][colum];
		
		for( int i =0; i < mat.length; i++) {
			for(int j = 0; j < colum; i++){
				mat[i][j] = tcd.nextInt();
			}
		}
		int number = tcd.nextInt();
		for( int i =0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == number) {
					System.out.println("position: " + mat.length + "," + mat[i].length );
					System.out.println("left: " + mat[i][j -1] );
			}
		}
	}
	}
}
