package src.tabuleiro;

public class Board {
	private int rows;
	private int colunms;
	private Piece[][] pieces;
	
	public Board(int rows, int colunms) {
		this.rows = rows;
		this.colunms = colunms;
		pieces = new Piece[rows][colunms];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColunms() {
		return colunms;
	}

	public void setColunms(int colunms) {
		this.colunms = colunms;
	}

	//metodos e sobrecarga
	public Piece piece(int row, int colunm) {
		return pieces[row][colunm];		
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//a função dele é ler a matriz e atribuir a ela o lugar onde ela vai ficar
	public void PlacePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		
		//tirar do null anterior
		piece.position = position;
	}
}
