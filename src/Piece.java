//6510451131 Ithikorn Ungniyom

public class Piece {
    private Square square;

    public Piece(Square location) {
        this.square = location;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
