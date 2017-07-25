package Intermediate_2.Library;

/**
 * Created by dmclark on 21/07/17.
 */
public class Person {

    String name = "";
    int id = 0;

    static int U_ID = 1;

    public Person(String name) {
        U_ID = U_ID + 1;
        id = U_ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getuId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
