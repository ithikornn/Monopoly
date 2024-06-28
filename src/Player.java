//6510451131 Ithikorn Ungniyom

import java.util.ArrayList;

public class Player {
    private String name;
    private Board board;
    private Piece piece;
    private ArrayList<Die> dies;
    public Player(String name) {
        this.name = name;
    }

    public int takeTurn() {
        int fv = 0;
        for (Die die: dies) {
            die.roll();
            fv += die.getFaceValue();
        }
        return fv;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public ArrayList<Die> getDies() {
        return dies;
    }

    public void setDies(ArrayList<Die> dies) {
        this.dies = dies;
    }
}
