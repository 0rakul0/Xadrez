package src.tabuleiro;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Erro ao criar o tabuleiro, precisa de no minimo 1 linha e uma coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	//deixar só o get para que não seja alterada o numero de linhas e colunas
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	//metodos e sobrecarga
	public Piece piece(int row, int column) {
		if(!posicaoExiste(row, column)){
			throw new BoardException("posicao não encontrada");
		}
		return pieces[row][column];		
	}
	public Piece piece(Position position) {
		if(!posicaoExiste(position)){
			throw new BoardException("posicao não encontrada");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//a função dele é ler a matriz e atribuir a ela o lugar onde ela vai ficar
	public void PlacePiece(Piece piece, Position position) {
		if(TemPiece(position)){
			throw new BoardException("já existe uma peça na posição " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		
		//tirar do null anterior
		piece.position = position;
	}

	//verifica se a posição existe
	public boolean posicaoExiste(int row, int column) {
	  return row >= 0 && row < rows && column >= 0 && column < columns;	
	}

	public boolean posicaoExiste(Position position) {
		return posicaoExiste(position.getRow(), position.getColumn());
	}
	//verifica se tem peça
	public boolean TemPiece(Position position) {
		if(!posicaoExiste(position)){
			throw new BoardException("já existe uma peça na posição " + position);
		}
		return piece(position) != null;
	}
}