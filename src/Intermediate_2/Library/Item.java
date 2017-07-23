package Intermediate_2.Library;

/**
 * Created by dmclark on 21/07/17.
 */
public abstract class Item {

    static int ID_Index = 0;
    protected int ID = 0;
    String name = "";
    boolean in_Lidrary = true;
    int out_At_U_ID = 0;

    public Item(String name) {
        ID_Index = ID_Index + 1;
        ID = ID_Index;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public boolean isIn_Lidrary() {
        return in_Lidrary;
    }

    public int getOut_At_U_ID() {
        return out_At_U_ID;
    }

    public void setIn_Lidrary(boolean in_Lidrary) {
        this.in_Lidrary = in_Lidrary;
    }

    public void setOut_At_U_ID(int out_At_U_ID) {
        this.out_At_U_ID = out_At_U_ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", in_Lidrary=" + in_Lidrary +
                ", out_At_U_ID=" + out_At_U_ID +
                '}';
    }
}
