package Intermediate_2.Strings;

/**
 * Created by dmclark on 26/07/17.
 */
public class Strings {


    public static void main(String[] args) {
        System.out.println(s_2("qwertyuiop", "asdrtyhjkl"));
    }


    public void Run() {

    }

    public static int s_1(String qwert, String asdfg) {
        String temp = "";
        for (int i = 0; i < asdfg.length(); i++) {
            for (int d = i + 1; d <= asdfg.length(); d++) {
//                System.out.println(asdfg.substring(i, d));
//                System.out.println(qwert.contains(asdfg.substring(i, d)));
                if (qwert.contains(asdfg.substring(i, d))) {
                    if (asdfg.substring(i, d).length() > temp.length()) {
                        temp = asdfg.substring(i, d);
                    }
                }
            }
        }
        return temp.length();
    }


    public static int s_2(String qwert, String asdfg) {

        int x = 0;
        int z = 0;
        int x_2 = 0;
        int z_2 = 0;
        int index = 0;
        String temp = "";

        for (int i = 0; i < asdfg.length(); i++) {
            for (int d = i + 1; d <= asdfg.length(); d++) {
//                System.out.println(asdfg.substring(i, d));
//                System.out.println(qwert.contains(asdfg.substring(i, d)));
                if (qwert.contains(asdfg.substring(i, d))) {
                    if (asdfg.substring(i, d).length() > temp.length()) {
                        temp = asdfg.substring(i, d);
                        x_2 = d;
                        z_2 = i;

                    }
                }
            }
        }
//        "qwe rty uiop",
//        "asd rty hjkl"
        if (temp != "") {

            z = qwert.indexOf(temp);
            x = qwert.indexOf(temp) + temp.length();

            for (int i = z - 1; i >= 0; i--) {
                z_2 = z_2 - 1;
//                System.out.println(qwert.charAt(i) + "  " + asdfg.charAt(z_2));
                if (z_2 < 0) {
                    break;
                } else {

                    if (qwert.charAt(i) != asdfg.charAt(z_2)) {
//                        System.out.println("1_");
                        index++;
                    }
                }
            }
            for (int i = x; i < qwert.length(); i++) {
                x_2 = x_2;
//                System.out.println(qwert.charAt(i) + "  " + asdfg.charAt(x_2));

                if (x_2 > asdfg.length()) {
                    break;
                } else {

                    if (!(qwert.charAt(i) == asdfg.charAt(x_2))) {
//                        System.out.println("2_");
                        index++;
                    }
                }
            }
            return index;
        } else {
            return qwert.length();
        }

    }


}
