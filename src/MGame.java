//6510451131 Ithikorn Ungniyom

import java.util.ArrayList;
import java.util.Arrays;

public class MGame {
    private int roundCount;
    private int round;
    private Board board;
    private ArrayList<Player> players;
    private ArrayList<Die> dies;

    public MGame(int round, ArrayList<Player> players) {
        this.roundCount = 0;
        this.round = round;
        this.players = players;
        dies = new ArrayList<>(Arrays.asList(new Die(), new Die()));
        this.board = createBoard(40);
    }

    private Board createBoard(int n) {
        ArrayList<Square> squares = new ArrayList<>();
        CityDictionary cityDictionary = new CityDictionary();
        for (int i = 0; i < n; i++) {
            squares.add(new Square(cityDictionary.getCity(i)));
        }
        board = new Board(squares);
        return board;
    }

    public void playGame() {
        for (Player player: players) {
            Piece piece = new Piece(board.getSquares().get(0));
            player.setBoard(board);
            player.setDies(dies);
            player.setPiece(piece);
        }
        while (roundCount < round) {
            playRound();
            roundCount++;
        }
    }
    private void playRound() {
        System.out.println("Round " + (roundCount + 1));
        for (Player player: players) {
            int fvTotal = player.takeTurn();
            Square oldLoc = player.getPiece().getSquare();
            Square newLoc = player.getBoard().getSquare(oldLoc, fvTotal);
            player.getPiece().setSquare(newLoc);
            System.out.println(fvTotal + " " + player.getName() + " " + player.getPiece().getSquare().getName());
        }
        System.out.println("-------------------------------");
    }
}
