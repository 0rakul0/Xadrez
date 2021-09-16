package src.tabuleiro;

public class Position {
    private int row;
    private int column;

    //construtor
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    //para impress�o na tela sobreposi��o
    @Override
    public String toString() {
        return row + ", " + column;
    }
}
