package ticTacToe;

import boardLayer.Board;
import boardLayer.PieceBoard;
import boardLayer.Position;

public class Piece extends PieceBoard{
	
	
	private Color color;

	public Piece(Board board, Color color) {
		super(board);
		 this.color = color;
	}

	
	public Color getColor() {
		return this.color;
	}
	
	public void Moves(Position position) {
		
	}
}
