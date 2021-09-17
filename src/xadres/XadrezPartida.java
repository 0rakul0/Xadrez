package src.xadres;

import src.tabuleiro.Board;

public class XadrezPartida {
	
	private Board board;
	
	public XadrezPartida() {
		board = new Board(8, 8);
	}
	
	// projetar as pe�as da partida
	
	public XadrezPiece[][] getPieces(){
		//temporario
		XadrezPiece[][] mat = new XadrezPiece[board.getRows()][board.getColunms()];
		
		//para percorrer a matriz
		for(int i=0;i<board.getRows();i++) {
			for(int j=0; j<board.getColunms();j++) {
				mat[i][j] = (XadrezPiece) board.piece(i,j);
			}
		}
		//retorna as pe�as da partida de xadrez
		return mat;
	}
}
