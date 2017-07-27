package Offline_Exercises;

/**
 * Created by dmclark on 27/07/17.
 */
public class Offline_Exercises {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("There"));

        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));

        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));

        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));

        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();

    }

    public static String doubleChar(String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i));
            sb.append(a.charAt(i));


        }
        return sb.toString();


    }

    public static String getSandwich(String a) {
        StringBuilder sb = new StringBuilder();
        int q = a.indexOf("bread");
        if (q == -1) {
            return "";
        }
        StringBuilder sb_2 = new StringBuilder(a);

        sb_2.replace(0, q + 5, "");
        for (int i = sb_2.length() - 1; i >= 0; i--) {
            sb.append(sb_2.charAt(i));
        }
        int x = sb.indexOf("daerb");
        if (x == -1) {
            return "";
        }
        sb_2.replace(sb_2.length() - x - 5, sb_2.length(), "");
        return sb_2.toString();
    }


    public static boolean evenlySpaced(int a, int b, int c) {

        int x = b - a;
        int s = c - b;
        int d = c - a;
        if (x == s || x == d || d == s || x == -s || x == -d || d == -s) {
            return true;
        }
        return false;


    }

    public static String nTwice(String a, int c) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c; i++) {
            sb.append(a.charAt(i));


        }
        for (int i = a.length() - 1 - c; i < (a.length() - 1); i++) {
            sb.append(a.charAt(i));


        }
        return sb.toString();


    }

    public static boolean endsLy(String a) {

        if (a.length() > 1) {

            return (a.substring((a.length() - 2), (a.length())).equals("ly"));
        }
        return false;
    }

    public static String stringClean(String a) {
        StringBuilder sb = new StringBuilder("");
        char x = ' ';
        for (int i = 0; i < a.length(); i++) {

            if (x != a.charAt(i)) {
                sb.append(a.charAt(i));
                x = a.charAt(i);
            }

        }
        return sb.toString();
    }

}
