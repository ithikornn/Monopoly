//6510451131 Ithikorn Ungniyom

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("tent"));
        players.add(new Player("aof"));
        players.add(new Player("henry"));

        MGame game = new MGame(5, players);
        game.playGame();
    }
}
