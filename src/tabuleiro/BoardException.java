package src.tabuleiro;

public class BoardException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	//excessões do tabuleiro
	public BoardException(String msg) {
		super(msg);
	}
	
}
