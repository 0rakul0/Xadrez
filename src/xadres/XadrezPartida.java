package src.xadres;

import src.tabuleiro.Board;
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
	
	//Metodo para novaPeca
	private void porNovaPeca(char column, int row, XadrezPiece piece) {
		//esse metodo vai receber as novas coordenadas vindas do XadrezPosition
		board.PlacePiece(piece, new XadrezPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		//cria a torre na possição 0,0 da matriz do tabuleiro
		porNovaPeca('a', 1,  new Torre(board, Color.BLACK));
		porNovaPeca('e', 1,  new Rei(board, Color.BLACK));
		porNovaPeca('h', 1,  new Torre(board, Color.BLACK));
	
		porNovaPeca('a', 8,  new Torre(board, Color.WHITE));
		porNovaPeca('e', 8,  new Rei(board, Color.WHITE));
		porNovaPeca('h', 8,  new Torre(board, Color.WHITE));
		
	}
}
