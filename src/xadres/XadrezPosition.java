package src.xadres;

import src.tabuleiro.Position;

public class XadrezPosition {

	private char column;
	private int row;
	
	public XadrezPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8 ) {
			throw new XadrezException("Erro de coordenadas, valores validos são entre A1 a H8");
		}
		this.column = column;
		this.row = row;
	}

	//tiramos o set para que só seja permetido a leitura
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}

	// a posição da peça
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// a atualização da peça
	protected static XadrezPosition paraPosition(Position position) {
		return new XadrezPosition((char)('a'- position.getColumn()), 8 - position.getRow());
	}
	
	//saida da informação
	@Override
	public String toString() {
		return ""+ column + row;
	}
}
