package boardLayer;

public class BoardDimensions {
	
	private Integer rowsBoard;
	private Integer columnsBoard;
	
	
	public BoardDimensions(Integer rowsBoard, Integer columnsBoard) {
		validadeDimensions(rowsBoard, columnsBoard);
		this.rowsBoard = rowsBoard;
		this.columnsBoard = columnsBoard;
	}

	public Integer getRowsBoard() {
		return rowsBoard;
	}


	public Integer getColumnsBoard() {
		return columnsBoard;
	}


	 public static void validadeDimensions(Integer rowsBoard, Integer columnsBoard) {
			if(rowsBoard < 4 || columnsBoard < 4) {
				throw new BoardExcpetion("tabuleiro com espaço insuficiente");
			}
		    else if(rowsBoard % 4  != 0 || columnsBoard % 4 != 0) {
				 throw new BoardExcpetion("tabuleiro com espaço insufieciente");
			}
	}
}
