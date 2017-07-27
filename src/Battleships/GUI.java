package Battleships;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by dmclark on 24/07/17.
 */
public class GUI extends Frame {
    public Button[][] b = new Button[12][12];
    private GUI_I listeners;
    // Constructor to setup GUI components and event handlers
    public GUI(int size, GUI_I a) {
        listeners = a;
        setLayout(new GridLayout(size, size, size, size));
        setSize(600, 600);
        // "super" Frame sets layout to 3x2 GridLayout, horizontal and verical gaps of 3 pixels

        // The components are added from left-to-right, top-to-bottom

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                b[x][y] = (new Button((x + "," + y)));
                b[x][y].addActionListener(new buttonListener());
                add(b[x][y]);

            }
        }


        setTitle("GridLayout Demo"); // "super" Frame sets title
        setSize(280, 150);           // "super" Frame sets initial size
        setVisible(true);            // "super" Frame shows
    }

    public void Shot(int x, int y) {
        listeners.someoneSaid_Shot(x, y);
    }

    public void edit(int x, int y, char c) {
        b[x][y].setLabel(x + "," + y + " " + c + "");

    }


    public class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Button buttonClicked = (Button) e.getSource(); //get the particular button that was clicked

            String[] l = buttonClicked.getLabel().split(",");
            // System.out.println(l[0]);
            int x = Integer.parseInt(l[0]);
            int y = Integer.parseInt(l[1]);
            //System.out.println(x+"hit"+y);
            Shot(x, y);
            //JOptionPane.showConfirmDialog(null, (x + "Game Over." + y));
        }
    }

}