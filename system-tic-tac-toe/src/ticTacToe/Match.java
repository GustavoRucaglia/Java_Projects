package ticTacToe;

import boardLayer.Board;
import boardLayer.BoardDimensions;
import boardLayer.Position;
import ticTacToe.pieces.Circle;

public class Match {
		private Board board;
		
		public Match() {
			board = new Board(new BoardDimensions(4,4));
		}
		
		
		public Board getBoard() {
			return board;
		}



		public Piece[][] matPieces(){
			     Piece[][] matriz = new Piece[board.getBoardDimensions().getRowsBoard()][board.getBoardDimensions().getColumnsBoard()];
			     for( int i=0; i < board.getBoardDimensions().getRowsBoard(); i++ ) {
			    	 for(int j =0; j < board.getBoardDimensions().getColumnsBoard(); j++) {
			    		  matriz[i][j] =(Piece) board.getPiecePosition(i,j);
			    	 }
			     }
			     return matriz;
		}
		
		public void placeNewPiece(MathPosition target, Piece piece) {
			  board.placePiece(piece, target.toPosition());
			  board.placePiece(new Piece(board, Color.BLUE), new Position(0,0));
		}
		
	
}
