package Intermediate_2.HashMaps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by dmclark on 21/07/17.
 */
public class Run {

    HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();
    int index = 0;

    public static void main(String[] args) {

        Run r = new Run();
        System.out.println(" : ");
        try {
            r.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(r.map);
        int temp = 0;
        String temp_2 = "";
        //System.out.println(temp + " : " + temp_2);
        for (String key : r.map.keySet()) {
            if (r.map.get(key).size() > temp) {
                temp = r.map.get(key).size();
                temp_2 = key;
            }
        }


        System.out.println(temp + " : " + temp_2);

        //System.out.println(r.map);

    }

    public void Run() {

    }


    public String abc(String qwert) {


        StringBuilder sb = new StringBuilder(qwert);
        //System.out.println("start");
        for (int x = 0; x < sb.length(); x++) {
//            System.out.println(x);

            int b = x;
            char z = 'z';
            for (int y = x; y < sb.length(); y++) {
//                System.out.println();
                if (sb.charAt(y) < sb.charAt(x)) {
                    char t = sb.charAt(x);
                    sb.setCharAt(x, sb.charAt(y));
                    sb.setCharAt(y, t);
                }
            }


        }

        //System.out.println(sb);
        return sb.toString();

    }

    public void get() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("wordList_2.txt"));
        try {

            String line = br.readLine();

            while (line != null) {
                String x = abc(line);
                ArrayList z = map.get(x);
                if (z != null) {
//                    System.out.println("###########");
                    z.add(line);
                } else {
//                   System.out.println("00000000000");
                    z = new ArrayList();
                    z.add(line);
                    map.put(x, z);
                }


                line = br.readLine();
                index++;
            }

        } catch (IOException e) {
            System.out.println("vrenviuernfvuierni");
            e.printStackTrace();
        } finally {
            br.close();
        }

    }


}

