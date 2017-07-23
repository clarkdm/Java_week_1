package Intermediate_2.Library;

/**
 * Created by dmclark on 21/07/17.
 */
public class Person {

    String name = "";

    static int U_ID = 0;

    public Person(String name) {
        U_ID = U_ID + 1;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getuId() {
        return U_ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
