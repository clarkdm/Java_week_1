package Intermediate_2.Library;

/**
 * Created by dmclark on 21/07/17.
 */
public class Maps extends Item {

    String loc;

    public Maps(String name, String loc) {
        super(name);
        this.loc = loc;
    }

    public Maps(int id, String name, String loc, boolean in_lidrary, int out_at_u_id) {
        super(id, name, in_lidrary, out_at_u_id);
        this.loc = loc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Maps{" +
                "ID='" + ID + '\'' +
                ", loc='" + loc + '\'' +
                ", name='" + name + '\'' +
                ", in_Lidrary='" + in_Lidrary + '\'' +
                ", out_At_U_ID='" + out_At_U_ID + '\'' +
                '}';
    }
}

