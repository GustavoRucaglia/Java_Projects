package ticTacToe.pieces;

import boardLayer.Board;
import ticTacToe.Color;
import ticTacToe.Piece;

public class Circle extends Piece {

	public Circle(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "O";
	}
    
}
