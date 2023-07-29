package ticTacToe;

import boardLayer.Position;

public class MathPosition {
		
		private char column;
		private int row;
		
		public MathPosition(char column, int row) {
			if (column < 'a' || column > 'h' || row < 1 || row > 8) {
				throw new MathExcpetion("Coloque um valor valido");
			}
			this.column = column;
			this.row = row;
		}

		public char getColumn() {
			return column;
		}

		public int getRow() {
			return row;
		}

		public Position toPosition() {
			return new Position(4 - row, column - 'a');
		}
		
		public static MathPosition fromPosition(Position position) {
			return new MathPosition((char)('a' + position.getColumns()), 4 - position.getRows());
		}
		
		@Override
		public String toString() {
			return "" + column + row;
		}
	}


