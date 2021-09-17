package src.xadres;

import src.tabuleiro.Board;
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
	
	//Metodo para novaPeca
	private void porNovaPeca(char column, int row, XadrezPiece piece) {
		//esse metodo vai receber as novas coordenadas vindas do XadrezPosition
		board.PlacePiece(piece, new XadrezPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		//cria a torre na possição 0,0 da matriz do tabuleiro
		porNovaPeca('a', 5,  new Torre(board, Color.BLACK));
		porNovaPeca('h', 3,  new Torre(board, Color.BLACK));
	}
}
