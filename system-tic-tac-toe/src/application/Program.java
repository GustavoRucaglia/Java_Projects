package application;

import java.util.Scanner;

import ticTacToe.Color;
import ticTacToe.Match;
import ticTacToe.MathPosition;
import ticTacToe.pieces.Circle;

public class Program {
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		while(true) {
	    Match match = new Match();
	    UI.printBoard(match.matPieces());
	    System.out.print("\nTarget:");
	    MathPosition target = UI.readChessPosition(tcd);
	    match.placeNewPiece(target, new Circle(match.getBoard(), Color.BLUE));
	    
	    tcd.close();
	}
}
}
