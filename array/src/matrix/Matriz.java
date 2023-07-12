package matrix;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		int n = tcd.nextInt();
		
		int[][] mat = new int[n][n];
		
		
		for(int i=0; i < n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = tcd.nextInt();
			}
		}
		System.out.println("main diagonal:");
		for(int i=0; i < n; i++) {
			for(int j=0; j<n; j++) {
				if( i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		int count = 0;
		
		for(int i=0; i < n; i++) {
			for(int j=0; j<n; j++) {
				if( mat[i][j] < 0) {
				count += 1;
				}
			}
		}
		System.out.println(count);
		
		tcd.close();
		
	}

}
