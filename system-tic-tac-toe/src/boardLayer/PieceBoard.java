package boardLayer;

public class PieceBoard {

	protected Position position;
	protected Board board;

	public PieceBoard(Board board) {
		this.board = board;
		this.position = null;
	}
	

	public Position getPosition() {
		return position;
	}
	
}
