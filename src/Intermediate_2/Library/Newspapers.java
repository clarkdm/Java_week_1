package Intermediate_2.Library;

import java.util.Date;

/**
 * Created by dmclark on 21/07/17.
 */
public class Newspapers extends Item {

    String date;

    public Newspapers(String name, String date) {
        super(name);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspapers{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", in_Lidrary=" + in_Lidrary +
                ", out_At_U_ID=" + out_At_U_ID +
                '}';
    }
}
