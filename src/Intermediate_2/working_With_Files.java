package Intermediate_2;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by dmclark on 20/07/17.
 */
public class working_With_Files {
    ArrayList<person> bobs;



    public working_With_Files() {
        bobs = new ArrayList<person>();


    }

    public boolean to_File(String a) {

        try {
            PrintWriter writer = new PrintWriter(a + ".txt", "UTF-8");
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

    public boolean from_File(String a) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(a + ".txt"));
        } catch (FileNotFoundException e) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                bobs.add(new person(line));
                line = br.readLine();
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



    public boolean add_Vehicle(person v) {
        return bobs.add(v);
    }

    public boolean remove_Vehicle(person v) {
        return bobs.remove(v);
    }
}
