package src.program;

import src.xadres.XadrezPiece;

public class UI {
	
	static void printBoard(XadrezPiece[][] pieces) {
		for(int i=0; i<pieces.length;i++) {
			// para imprimir o numero
			System.out.print((8-i)+" ");
			for(int j=0; j<pieces.length;j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("    a    b    c    d    e    f    g    h");
	}
	
	//metodo auxiliar da pe�a
	
	private static void printPiece(XadrezPiece piece) {
		if(piece == null) {
			System.out.print("  -  ");
		}else {
			System.out.print("  "+piece+"  ");
		}
	}
}
