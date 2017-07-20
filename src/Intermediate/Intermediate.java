package Intermediate;

import java.util.ArrayList;

public class Intermediate {

    public static void main(String[] args) {

        System.out.println(blackjack(23, 45));
        System.out.println(blackjack(23, 4));
        System.out.println(blackjack(6, 45));
        System.out.println(blackjack(21, 7));
        System.out.println(blackjack(8, 20));

        System.out.println();
        System.out.println(unique_Sum(1, 2, 3));
        System.out.println(unique_Sum(3, 3, 3));
        System.out.println(unique_Sum(1, 1, 2));

        System.out.println();
        System.out.println(too_Hot(111, true));
        System.out.println(too_Hot(30, true));
        System.out.println(too_Hot(77, true));
        System.out.println(too_Hot(94, true));
        System.out.println(too_Hot(111, false));
        System.out.println(too_Hot(77, false));
        System.out.println(too_Hot(33, false));
        System.out.println(too_Hot(94, false));
        People();

        Garage g_1 = new Garage();
        Car v_1 = new Car("bob", 22, "m", 4, 4, 2);
        Car v_2 = new Car("bob_2", 25, "A", 5, 3, 4);
        helicopter v_3 = new helicopter("bob_3", 2500, 5);
        Motorcycle v_4 = new Motorcycle("bob_4", 25, 1);

        g_1.add_Vehicle(v_1);


        System.out.println(g_1.add_Vehicle(v_1));

        System.out.println(g_1.add_Vehicle(v_2));
        System.out.println(g_1.calculating_bills());
        System.out.println(g_1.add_Vehicle(v_3));
        System.out.println(g_1.calculating_bills());
        System.out.println(g_1.add_Vehicle(v_4));
        System.out.println(g_1.calculating_bills());

        System.out.println(g_1.bobs.size());
        System.out.println(g_1.calculating_bills());
        System.out.println(g_1.remove_Vehicle(v_1));
        System.out.println(g_1.calculating_bills());
        System.out.println(g_1.bobs.size());
        System.out.println(g_1.add_Vehicle(v_1));
        System.out.println(g_1.bobs.size());


        System.out.println();
        System.out.println(g_1.bobs);
        System.out.println(g_1.fix_index(1));
        System.out.println(g_1.bobs);
        System.out.println(g_1.fix_Vehicle(v_4));
        System.out.println(g_1.bobs);

        System.out.println();

        System.out.println("Enter your username: ");
        //Scanner scanner = new Scanner(System.in);

        //System.out.println(g_1.fix_Text(scanner.nextLine()));
        System.out.println(g_1.bobs);


        double temp = Math.ceil((79 / 8.0));
        System.out.println(Math.round(79 / 8));
        System.out.println(temp);
        System.out.println(79 % 8);

        Paint_Wizard p_W = new Paint_Wizard();
        Paint p1 = new Paint(10, 20, 19.99,"b");
        Paint p2 = new Paint(11, 15, 17.99,"bo");
        Paint p3 = new Paint(20, 10, 25,"bob");
        p_W.add_Paint(p1);
        p_W.add_Paint(p2);
        p_W.add_Paint(p3);

        System.out.println(p1.num_Tins(2060));
        System.out.println(p2.num_Tins(2060));
        System.out.println(p3.num_Tins(2060));
        System.out.println(p_W.get_least_wastes(165));
        System.out.println(p_W.get_Cheapest(165));


    }


    public static void People() {

        Person bob = new Person("bob", 10, "ArrayList");
        Person bo = new Person("bob2", 11, "ArrayList");
        Person b = new Person("bob3", 12, "ArrayList");

        ArrayList<Person> bobs = new ArrayList<Person>();
        bobs.add(bob);
        bobs.add(bo);
        bobs.add(b);

        for (int i = 0; i < bobs.size(); i++) {
            System.out.println(bobs.get(i));
        }

    }


    public static int blackjack(int a, int b) {
        if (b > 21 && a > 21) {

            return 0;
        }

        if (a == b) {
            if (a <= 21) {
                return a;
            }

            return 0;
        }

        if (a <= 21 && b > 21) {

            return a;

        }

        if (b <= 21 && a > 21) {

            return b;

        }
        if (a > b) {
            return a;

        } else {
            return b;
        }

    }

    public static int unique_Sum(int a, int b, int c) {
        int total = 0;
        if (a == b | a == c) {
            total = 0;
        } else {
            total = a;
        }
        if (a == b | b == c) {
            total = 0;
        } else {
            total = total + b;
        }

        if (a == c | b == c) {
            total = 0;
        } else {
            total = total + c;
        }
        return total;

    }

    public static boolean too_Hot(int temperature, Boolean isSummer) {

        if (isSummer) {
            if (temperature < 100 && temperature > 60) {
                return true;
            } else {
                return false;
            }

        } else {
            if (temperature < 90 && temperature > 60) {
                return true;
            } else {
                return false;
            }
        }

    }

}
