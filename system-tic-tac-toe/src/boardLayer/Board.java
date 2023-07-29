package boardLayer;

public class Board {
	
	private BoardDimensions boardDimensions;
	private PieceBoard[][] piecesBoard;
	
	public Board(BoardDimensions boardDimensions) {
		this.boardDimensions = boardDimensions;
		this.piecesBoard = new PieceBoard[boardDimensions.getRowsBoard()][boardDimensions.getColumnsBoard()];
	}

	public BoardDimensions getBoardDimensions() {
		return boardDimensions;
	}

	public PieceBoard[][] getPiecesBoard() {
		return piecesBoard;
	}
	
	public void placePiece(PieceBoard piece, Position position) {
		position.validatePosition(position.getRows(), position.getColumns(), boardDimensions);
		piecesBoard[position.getRows()][position.getColumns()] = piece;
		piece.position = position;
	}
	
	public PieceBoard getPiecePosition(Integer rows, Integer columns) {
		  return piecesBoard[rows][columns];
	}
	
	public PieceBoard getPiecePosition(Position position) {
		  return getPiecePosition(position.getRows(),position.getColumns());
	}
	
	
	
	
}
