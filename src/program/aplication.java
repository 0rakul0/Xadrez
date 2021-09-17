package src.program;

import src.xadres.XadrezPartida;

public class aplication {
    public static void main(String[] args) {
    	
    	XadrezPartida xadrezPartida = new XadrezPartida();
    	
    	UI.printBoard(xadrezPartida.getPieces());
    	
    }
}
