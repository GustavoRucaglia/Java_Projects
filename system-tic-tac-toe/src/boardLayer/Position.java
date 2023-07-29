package boardLayer;

public class Position {
	private Integer row;
	private Integer column;
	
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	public Integer getRows() {
		return row;
	}


	public Integer getColumns() {
		return column;
	}
    
	public  void validatePosition(Integer row, Integer column, BoardDimensions board){
			if(row < 0 || row >=  board.getRowsBoard()){
				 throw new BoardExcpetion("essa linha não está no tabuleiro");
			}
			if(column < 0 || column >=  board.getColumnsBoard()){
				 throw new BoardExcpetion("essa coluna não está no tabuleiro");
			}
			
	}
	  @Override
	    public String toString() {
	        return row + ""+ column;
	    }
}
