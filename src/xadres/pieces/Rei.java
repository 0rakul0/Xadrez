package src.xadres.pieces;

import src.tabuleiro.Board;
import src.xadres.XadrezPiece;
import src.xadres.Color;

public class Rei extends XadrezPiece {

	public Rei(Board board, Color color) {
		super(board, color);	
	}
	
	@Override
	public String toString() {
		//atribui��o da letra a pe�a
		return "R";
	}
	
}
