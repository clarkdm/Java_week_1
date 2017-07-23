package Intermediate_2.Library;

import java.util.ArrayList;

/**
 * Created by dmclark on 21/07/17.
 */
public class Library implements Library_I {
    ArrayList<Item> bobs;
    ArrayList<Person> peps;

    public Library() {
        bobs = new ArrayList<Item>();
        peps = new ArrayList<Person>();
    }

    public boolean add_Books(String name, String ather) {


        return bobs.add(new Books(name, ather));
    }

    public boolean add_Maps(String name, String loc) {


        return bobs.add(new Books(name, loc));
    }

    public boolean add_Newspapers(String name, String date) {


        return bobs.add(new Books(name, date));
    }


    public boolean Check_out_item(int id, String U_name) {

        if (bobs.get(get_index(id)).isIn_Lidrary()) {
            bobs.get(get_index(id)).setIn_Lidrary(false);
            bobs.get(get_index(id)).setOut_At_U_ID(get_ID_for_Person(U_name));
            return true;
        }
        return false;

    }

    public boolean Check_in_item(int id) {

        if (!bobs.get(get_index(id)).isIn_Lidrary()) {
            bobs.get(get_index(id)).setIn_Lidrary(true);
            bobs.get(get_index(id)).setOut_At_U_ID(0);
            return true;
        }
        return false;

    }

    public void Remove_item(int id) {
        bobs.remove(get_index(id));

    }

    public void Remove_item(String name) {
        bobs.remove(get_index(get_ID(name)));
    }


    public boolean Update_Books(String name, String new_name, String ather) {
        if (get_ID(name) >= 0) {
            System.out.println(get_index_from_name(name));
            ((Books) bobs.get(get_index_from_name(name))).setName(new_name);
            ((Books) bobs.get(get_index_from_name(name))).setAther(ather);
            System.out.println(bobs.size());
            // bobs.remove(get_index_from_name(name));
            System.out.println(bobs.size());
            return true;
        }
        return false;
    }

    public boolean Update_Maps(String name, String new_name, String loc) {

        if (get_ID(name) >= 0) {
            ((Maps) bobs.get(get_index_from_name(name))).setName(new_name);
            ((Maps) bobs.get(get_index_from_name(name))).setLoc(new_name);
            bobs.remove(get_index_from_name(name));
            return true;
        }
        return false;
    }

    public boolean Update_Newspapers(String name, String new_name, String date) {

        if (get_ID(name) >= 0) {
            ((Newspapers) bobs.get(get_index_from_name(name))).setName(new_name);
            ((Newspapers) bobs.get(get_index_from_name(name))).setDate(date);
            bobs.remove(get_index_from_name(name));
            return true;
        }
        return false;


    }

    private int get_index_from_name(String name_) {
        return get_index(get_ID(name_));
    }

    private int get_index(int id) {
        for (int i = 0; i < bobs.size(); i++) {
            if (bobs.get(i).getID() == id) {
                return bobs.get(i).getID();
            }
        }

        return -1;
    }

    public int get_ID(String name_) {

        for (int i = 0; i < bobs.size(); i++) {
            if (bobs.get(i).getName().equals(name_)) {
                return bobs.get(i).getID();
            }
        }

        return -1;
    }

    private int get_index_from_name_for_Person(String name_) {
        return get_index_for_Person(get_ID_for_Person(name_));
    }

    private int get_index_for_Person(int id) {
        for (int i = 0; i < peps.size(); i++) {
            if (peps.get(i).getuId() == id) {
                return peps.get(i).getuId();
            }
        }

        return -1;
    }

    private int get_ID_for_Person(String name_) {

        for (int i = 0; i < peps.size(); i++) {
            if (peps.get(i).getName().equals(name_)) {
                return peps.get(i).getuId();
            }
        }

        return -1;
    }


    public String all_Item_toString() {
        return "Library{" +
                "bobs=" + bobs +
                '}';
    }


    public String all_U_toString() {
        return "Library{" +
                "peps=" + peps +
                '}';
    }

    @Override
    public boolean Register_person(String name) {
        return peps.add(new Person(name));
    }

    @Override
    public boolean Delete_person(String name) {
        if (get_ID_for_Person(name) >= 0) {
            peps.remove(get_index_from_name_for_Person(name));
            return true;
        }
        return false;
    }

    @Override
    public boolean Update_person(String name, String new_name) {
        if (get_ID_for_Person(name) >= 0) {
            peps.get(get_index_from_name_for_Person(name)).setName(new_name);
            peps.remove(get_index_from_name_for_Person(name));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bobs=" + bobs +
                ", peps=" + peps +
                '}';
    }
}
