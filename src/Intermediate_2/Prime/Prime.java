package Intermediate_2.Prime;

import java.util.ArrayList;

/**
 * Created by dmclark on 22/07/17.
 */
public class Prime {

    long T = 50;
    long[] R;
    static long index = 0;


    public static void main(String[] args) {
        get_Next_Prime();
    }

    public static void get_Next_Prime() {
        for (long i = 2; i < 3000000; i++) {

//            if (math.) {
//                System.out.println(i);
//            }
            if (mod_next(i, 2)) {
                index = index + 1;

            }
        }

        return;
    }

    public static boolean mod_next(long x, long y) {
        // System.out.println("hi " + x % y + " " + x + " % " + y);
        if ((x % 2) == 0) {
            return false;
        }
        long x2 = x / 2;
        while (true) {
            if (y > x2) {
                return true;


            } else if (!((x % y) == 0)) {
                // System.out.println("hi " + y);
                y = y + 2;
            } else {
                return false;
            }
        }

    }


}
