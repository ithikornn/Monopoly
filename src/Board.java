//6510451131 Ithikorn Ungniyom

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }
    public Square getSquare(Square oldLoc, int fvTotal) {
        Square curLoc = null;
        for (int i = 0; i < squares.size(); i++) {
            if (oldLoc.equals(squares.get(i))) {
                curLoc = squares.get((i + fvTotal) % squares.size());
            }
        } return curLoc;
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
}
