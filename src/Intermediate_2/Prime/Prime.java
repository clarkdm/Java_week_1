package Intermediate_2.Prime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dmclark on 22/07/17.
 */
public class Prime {

    private static Long inde = new Long(0);
    Long T = new Long(50);
    //    static ArrayList<Long> r = new ArrayList<Long>();
    static HashMap<Long, Long> r = new HashMap<Long, Long>();
    static Long index = new Long(0);


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
// Run some code;


        get_Next_Prime();
        System.out.println(r.size());
        long stopTime = System.currentTimeMillis();

        System.out.println("Elapsed time was " + ((stopTime - startTime) / 100) + " miliseconds.");
    }

    public static void get_Next_Prime() {
        for (Long i = new Long(2); i < 3000000; i++) {

//            if (math.) {
            // System.out.println(i);
//            }
            if (mod_next(i)) {
                index = index + 1;

            }
        }

        return;
    }

    public static boolean mod_next(Long x) {


        if ((x % 2) == 0 & x != 2) {
            return false;
        }
        if ((x % 3) == 0 & x != 3) {
            return false;
        }
        if ((x % 5) == 0 & x != 5) {
            return false;
        }
        if ((x % 7) == 0 & x != 7) {
            return false;
        }
        if ((x % 11) == 0 & x != 11) {
            return false;
        }
        if ((x % 13) == 0 & x != 13) {
            return false;
        }
        if ((x % 17) == 0 & x != 17) {
            return false;
        }
        if ((x % 19) == 0 & x != 19) {
            return false;
        }
        if ((x % 23) == 0 & x != 23) {
            return false;
        }
        if ((x % 29) == 0 & x != 29) {
            return false;
        }
        if ((x % 31) == 0 & x != 31) {
            return false;
        }
        if ((x % 37) == 0 & x != 37) {
            return false;
        }
        if ((x % 41) == 0 & x != 41) {
            return false;
        }
        if ((x % 43) == 0 & x != 43) {
            return false;
        }
        if ((x % 47) == 0 & x != 47) {
            return false;
        }
        if ((x % 53) == 0 & x != 53) {
            return false;
        }
        if ((x % 59) == 0 & x != 59) {
            return false;
        }
        if ((x % 61) == 0 & x != 61) {
            return false;
        }
        if ((x % 67) == 0 & x != 67) {
            return false;
        }
        if ((x % 71) == 0 & x != 71) {
            return false;
        }
        if ((x % 73) == 0 & x != 73) {
            return false;
        }
        if ((x % 79) == 0 & x != 79) {
            return false;
        }
        if ((x % 83) == 0 & x != 83) {
            return false;
        }
        if ((x % 89) == 0 & x != 89) {
            return false;
        }
        //System.out.println("hi " + r);
        for (Long i = new Long(2); i < r.size(); i++) {
            //System.out.println("hi " + r.size()+" "+i);
            if ((x % r.get(i)) == 0) {
                return false;
            }
        }


        Long y = new Long(2);
        Long x2 = x / 2;

        while (true) {
            if (y > x2) {


                r.put(new Long(r.size() + 1), x);
                System.out.println("hi " + " dd " + x);
                return true;


            } else if ((x % y) == 0) {
                //
                return false;

            } else {
                y = y + 2;
            }
        }

    }


}
