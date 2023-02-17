import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.io.*;
import javax.swing.*;


class Main  {
    static JFrame frame;
    static JPanel panel;
    static JLabel label;
    static JButton button;



    public static void main(String[] args) {



        frame = new JFrame(); // creating instance of new frame

        frame.setVisible(true); // set visibility of frame true
        frame.setSize(400,400); // setting height and width using setSize( int , int );
        frame.setLayout(new FlowLayout()); // updating layout of frame as flowLayout


        panel = new JPanel(); // creating panel

        // creating button in java
        button = new JButton("Add"); // name of button written in ( )
        panel.add(button);// for adding button in java

        // creating label in java ( label = content in window )
        label = new JLabel( " hey i am kartikey " );
        panel.add(label);// adding JLabel

        // adding checkbox in java
        JCheckBox check_box1 = new JCheckBox("vaghani");
        JCheckBox check_box2 = new JCheckBox("ravi");

        panel.add(check_box1);
        panel.add(check_box2);

        frame.add(panel);

    }
}