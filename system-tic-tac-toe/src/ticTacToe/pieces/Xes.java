package ticTacToe.pieces;

import boardLayer.Board;
import ticTacToe.Color;
import ticTacToe.Piece;

public class Xes extends Piece{

	public Xes(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return  "X";
	}
	
	
}
