package src.program;

import src.xadres.XadrezPartida;

public class Application {
    public static void main(String[] args) {
    	
    	XadrezPartida xadrezPartida = new XadrezPartida();
    	
    	UI.printBoard(xadrezPartida.getPieces());
    	
    }
}
