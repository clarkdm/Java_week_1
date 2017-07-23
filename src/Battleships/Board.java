package Battleships;

/**
 * Created by dmclark on 23/07/17.
 */
public class Board {

    int size;
    char[][] board;
    int patrol_boat = 2;
    int battleships = 3;
    int submarine = 3;
    int destroyer = 4;
    int carrier = 5;
    //
    // empte o
    // miss x
    // patrol boat  pp      PP
    // battleships  bbb     BBB
    // submarine    sss     SSS
    // destroyer    dddd    DDDD
    // carrier      ccccc   CCCCC


    public Board(int size) {
        this.size = size;
        board = new char[size][size];


    }

    public boolean if_empte(int x, int y) {
        if (board[x][y] == 'o') {
            return true;
        }
        return false;
    }

    public boolean can_plas(int l, int x, int y, int xd, int yd) {

        for (int i = 0; i < l; i++) {
            if (!if_empte(x, y)) {
                return false;
            } else {
                y = y + yd;
                x = x + xd;
            }
        }
        return true;
    }

    public boolean plas(char type, int l, int x, int y, int xd, int yd) {
        for (int i = 0; i < l; i++) {
            board[x][y] = type;
            y = y + yd;
            x = x + xd;
        }
        return true;
    }

    public boolean add_boat(char type, int x, int y, int d) {
        int xd = 0;
        int yd = 0;
        int l = 1;
        if (d == 1) {
            xd = 1;
            yd = 0;
        } else if (d == 2) {
            xd = 0;
            yd = 1;
        } else if (d == 3) {
            xd = -1;
            yd = 0;
        } else if (d == 4) {
            xd = 0;
            yd = -1;
        }

        if (type == 'p') {
            l = patrol_boat;

        } else if (type == 'b') {
            l = battleships;

        } else if (type == 's') {
            l = submarine;

        } else if (type == 'd') {
            l = destroyer;

        } else if (type == 'c') {
            l = carrier;
        }

        if (can_plas(l, x, y, xd, yd)) {
            plas(type, l, x, y, xd, yd);
            return true;
        }
        return false;

    }


}
