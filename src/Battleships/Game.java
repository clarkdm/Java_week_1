package Battleships;

/**
 * Created by dmclark on 23/07/17.
 */
public class Game {

    Board b1;
    Board b2;
    int size;
    int patrol_boat = 2;
    int battleships = 2;
    int submarine = 1;
    int destroyer = 1;
    int carrier = 1;
    int t;
    boolean start;

    public Game(int size) {
        this.size = size;
        b1 = new Board(size);
        b2 = new Board(size);


    }

    private boolean set_Board(Board b) {
        for (int i = 0) {

        }
    }


}
