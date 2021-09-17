package src.xadres;

import src.tabuleiro.Board;
import src.tabuleiro.Position;
import src.xadres.pieces.Rei;
import src.xadres.pieces.Torre;

public class XadrezPartida {
	
	private Board board;
	
	public XadrezPartida() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	// projetar as peï¿½as da partida
	
	public XadrezPiece[][] getPieces(){
		//temporario
		XadrezPiece[][] mat = new XadrezPiece[board.getRows()][board.getColumns()];
		
		//para percorrer a matriz
		for(int i=0;i<board.getRows();i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (XadrezPiece) board.piece(i,j);
			}
		}
		//retorna as peï¿½as da partida de xadrez
		return mat;
	}
	
	private void initialSetup() {
		//cria a torre na possição 0,0 da matriz do tabuleiro
		board.PlacePiece(new Torre(board, Color.BLACK), new Position(0, 0));
		board.PlacePiece(new Rei(board, Color.BLACK), new Position(0, 4));
		board.PlacePiece(new Torre(board, Color.WHITE), new Position(0, 7));
	}
}
