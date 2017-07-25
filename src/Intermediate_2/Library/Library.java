package Intermediate_2.Library;

import Intermediate_2.person;

import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

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


        return bobs.add(new Maps(name, loc));
    }

    public boolean add_Newspapers(String name, String date) {


        return bobs.add(new Newspapers(name, date));
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
            Books temp = (Books) bobs.get(get_index_from_name(name));
//            System.out.println(get_index_from_name(name));
//            System.out.println(temp.getAther());
//            bobs.remove(get_index_from_name(name));
            temp.setName(new_name);
//            System.out.println(temp.getAther());
            temp.setAther(ather);
//            System.out.println(temp.getAther());
            bobs.add(temp);
            return true;
        }
        return false;
    }

    public boolean Update_Maps(String name, String new_name, String loc) {

        if (get_ID(name) >= 0) {
            Maps temp = ((Maps) bobs.get(get_index_from_name(name)));
            bobs.remove(get_index_from_name(name));
            temp.setName(new_name);
            temp.setLoc(new_name);
            bobs.add(temp);

            return true;
        }
        return false;
    }

    public boolean Update_Newspapers(String name, String new_name, String date) {

        if (get_ID(name) >= 0) {
            Newspapers temp = ((Newspapers) bobs.get(get_index_from_name(name)));
            bobs.remove(get_index_from_name(name));
            temp.setName(new_name);
            temp.setDate(date);
            bobs.add(temp);
            return true;
        }
        return false;


    }

    private int get_index_from_name(String name_) {

        return get_index(get_ID(name_));
    }

    private int get_index(int id) {
        for (int i = 0; i < bobs.size(); i++) {
            //System.out.println(id + "  " + bobs.get(i).getID());
            if (bobs.get(i).getID() == id) {
//                System.out.println("###########");

                return i;
            }
        }

        return -1;
    }

    public int get_ID(String name_) {

        for (int i = 0; i < bobs.size(); i++) {
//            System.out.println("########### " + bobs.get(i).getName().equals(name_));
//            System.out.println("########### 2 " + bobs.get(i).getName()+" " +name_);
            if (bobs.get(i).getName().equals(name_)) {
//                System.out.println("id "+bobs.get(i).getID());
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

    @Override
    public String all_Item_toString_2() {
        String temp = "";
        for (int i = 0; i < bobs.size(); i++) {
            if (bobs.get(i).getOut_At_U_ID() > 0) {
                temp = temp + "Name :" + bobs.get(i).getName() + ", U_ID :" + bobs.get(i).getOut_At_U_ID() + "\n";


            }
        }
        return temp;
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
            Person temp = peps.get(get_index_from_name_for_Person(name));
            peps.remove(get_index_from_name_for_Person(name));

            temp.setName(new_name);
            peps.add(temp);
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


    public boolean to_File() {

        try {
            PrintWriter writer = new PrintWriter("stuf.txt", "UTF-8");
            for (int i = 0; i < bobs.size(); i++) {

                writer.println(bobs.get(i));
            }

            writer.close();
        } catch (IOException e) {
            return false;
            // do something
        }
        return true;
    }

    public boolean from_File() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("stuf.txt"));
        } catch (FileNotFoundException e) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();


            while (line != null) {

                //System.out.println("test   "+line);
                bobs.add(add(line));

                line = br.readLine();
                //System.out.println("test   "+line);
            }

        } catch (IOException e) {
            return false;
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                return false;
            }
            return true;
        }

    }

    private Item add(String a) {
        Item q = null;

        StringTokenizer st = new StringTokenizer(a, "{");

        String temp = st.nextToken();

        if (temp.equals("Books")) {
            StringTokenizer st_2 = new StringTokenizer(st.nextToken(), "\'");


            st_2.nextToken();
            int id = Integer.parseInt(st_2.nextToken());


            st_2.nextToken();
            String ather = st_2.nextToken();
            st_2.nextToken();
            String name = st_2.nextToken();
            st_2.nextToken();
            boolean in_Lidrary = false;
            if ("true".equals(st_2.nextToken())) {
                in_Lidrary = true;
            }
            st_2.nextToken();
            int out_At_U_ID = Integer.parseInt(st_2.nextToken());

            q = new Books(id, ather, name, in_Lidrary, out_At_U_ID);

        } else if (temp.equals("Newspapers")) {
            StringTokenizer st_2 = new StringTokenizer(st.nextToken(), "\'");

            st_2.nextToken();
            int id = Integer.parseInt(st_2.nextToken());
            st_2.nextToken();
            String name = st_2.nextToken();
            st_2.nextToken();
            String date = st_2.nextToken();
            st_2.nextToken();
            boolean in_Lidrary = false;
            if ("true".equals(st_2.nextToken())) {
                in_Lidrary = true;
            }
            st_2.nextToken();
            int out_At_U_ID = Integer.parseInt(st_2.nextToken());

            q = new Newspapers(id, name, date, in_Lidrary, out_At_U_ID);

        } else if (temp.equals("Maps")) {
            StringTokenizer st_2 = new StringTokenizer(st.nextToken(), "\'");

            st_2.nextToken();
            int id = Integer.parseInt(st_2.nextToken());
            st_2.nextToken();
            String loc = st_2.nextToken();
            st_2.nextToken();
            String name = st_2.nextToken();
            st_2.nextToken();
            boolean in_Lidrary = false;
            if ("true".equals(st_2.nextToken())) {
                in_Lidrary = true;
            }
            st_2.nextToken();
            int out_At_U_ID = Integer.parseInt(st_2.nextToken());

            q = new Maps(id, loc, name, in_Lidrary, out_At_U_ID);

        }


        return q;
    }

}
