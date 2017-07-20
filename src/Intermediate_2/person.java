package Intermediate_2;

import java.util.StringTokenizer;

/**
 * Created by dmclark on 20/07/17.
 */
public class person {



    String name ="";
    int age = 0;
    String occupation = "";

    public person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public person(String p_S) {

        StringTokenizer st = new StringTokenizer(p_S,"\'");
        st.nextToken();


        this.name = st.nextToken();
        st.nextToken();
        this.age = Integer.parseInt(st.nextToken());
        st.nextToken();
        this.occupation = st.nextToken();
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
