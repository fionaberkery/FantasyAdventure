package quests;

import players.Player;
import rooms.Room;

import java.util.ArrayList;

public class Quest {

    ArrayList<Room> rooms;
    Player player;
    boolean gameToBeSetTo;


    public Quest(ArrayList<Room> rooms, Player player) {
        this.rooms = rooms;
        this.player = player;
    }

    public boolean checkIfDone() {
        for (Room room : rooms) {
            gameToBeSetTo = true;
            if (!player.completeRoom(room)) {
                gameToBeSetTo = false;
            }
        }
        return gameToBeSetTo;
    }


    public void playGame() {
        boolean gameComplete = false;
        while (!gameComplete) {
            gameToBeSetTo = checkIfDone();
            gameComplete = gameToBeSetTo;
        }
    }
}
