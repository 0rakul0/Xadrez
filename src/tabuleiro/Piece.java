package src.tabuleiro;

public class Piece {
   
	protected Position position;
    private Board board;
	
    public Piece(Board board) {
		this.board = board;
		position = null;
	}

    //somente classes dentro do mesmo pacote e sub-classes vao ter acesso ao tabuleiro
	protected Board getBoard() {
		return board;
	}

	
    
}
