package src.xadres;

import src.tabuleiro.Position;

public class XadrezPosition {

	private char column;
	private int row;
	
	public XadrezPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8 ) {
			throw new XadrezException("Erro de coordenadas, valores validos s�o entre A1 a H8");
		}
		this.column = column;
		this.row = row;
	}

	//tiramos o set para que s� seja permetido a leitura
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}

	// a posi��o da pe�a
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// a atualiza��o da pe�a
	protected static XadrezPosition paraPosition(Position position) {
		return new XadrezPosition((char)('a'- position.getColumn()), 8 - position.getRow());
	}
	
	//saida da informa��o
	@Override
	public String toString() {
		return ""+ column + row;
	}
}
