package Intermediate_2.Library;

/**
 * Created by dmclark on 21/07/17.
 */
public class Books extends Item {

    String ather;

    public Books(String name, String ather) {
        super(name);
        this.ather = ather;
    }

    public String getAther() {
        return ather;
    }

    public void setAther(String ather) {
        this.ather = ather;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ID=" + ID +
                ", ather='" + ather + '\'' +
                ", name='" + name + '\'' +
                ", in_Lidrary=" + in_Lidrary +
                ", out_At_U_ID=" + out_At_U_ID +
                '}';
    }
}
