/**
 * Created by dmclark on 17/07/17.
 */
public class Hello {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(helloWorld());
        System.out.println(parameters_operators(5, 8));
        System.out.println(conditionals(5, 8, true));
        System.out.println(conditionals(5, 8, false));
        System.out.println(conditionals2(0, 8, true));
        System.out.println(conditionals2(5, 0, false));
        iteration(5);
        arrays();
        iteration_arrays();
        iteration_arrays_2();
    }


    static String helloWorld() {
        return "Hello World!_2";
    }

    static int parameters_operators(int num_1, int num_2) {


        return num_1 + num_2;
    }

    static int conditionals(int num_1, int num_2, boolean modify) {


        if (modify){
            return num_1 + num_2;
        }else {
            return num_1 * num_2;
        }}

    static int conditionals2(int num_1, int num_2, boolean modify) {

        if (num_1 == 0) {
            return num_2;
        } else if (num_2 == 0) {
            return num_1;
        } else {
            if (modify) {
                return num_1 + num_2;
            } else {
                return num_1 * num_2;
            }
        }
    }
    static void iteration(int num_1) {
        for (int i = 0; i<=9;i++){
            System.out.println(conditionals2(i, num_1,true));
        }
    }
    static void arrays() {
       int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("");
        System.out.println(conditionals2(a[1],a[6],true));

    }
    static void iteration_arrays() {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("");
        for (int i = 0; i<a.length;i++){

            System.out.println(a[i]);
        }

    }

    static void iteration_arrays_2() {
        int a[] = new int[10];
        System.out.println("");
        for (int i = 0; i<a.length;i++){
            a[i] = i+1;
            if (i<a.length-1) {
                System.out.print(a[i] + ",");
            }else {
                System.out.print(a[i]);
            }
        }
        System.out.println();
        for (int i = 0; i<a.length;i++){
            a[i] = a[i] * 10;
            if (i<a.length-1) {
                System.out.print(a[i] + ",");
            }else {
                System.out.print(a[i]);
            }

        }

    }





}
