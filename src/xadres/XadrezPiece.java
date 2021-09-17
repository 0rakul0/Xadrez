package src.xadres;

import src.tabuleiro.Board;
import src.tabuleiro.Piece;

public class XadrezPiece extends Piece {

	private Color color;

	public XadrezPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
