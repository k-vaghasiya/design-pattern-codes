import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.*;

public class Calculate  {
    JButton button;
    JTextField text_box1;
    JTextField text_box2;
    JLabel Result;
    JDialog dilouge;
    Calculate ()  {


        JFrame frame = new JFrame("kv");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        text_box1 = new JTextField(20);
        text_box2 = new JTextField(20);

        Result = new JLabel("Result : ");

        button = new JButton("Calculate");

        button.setBounds(10,10,100,100);
        button.setBackground(Color.red);


        frame.add(text_box1);
        frame.add(text_box2);
        frame.add(button);
        frame.add(Result);
        frame.setSize( 400 , 400 );
        frame.setVisible(true);
        frame.setLayout(new FlowLayout()); // updating layout of frame as flowLayout
        dilouge.getGraphics();

        ActionListener ae = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(text_box1.getText());
                int b = Integer.parseInt(text_box2.getText());

                int c = a + b;

                Result.setText(c + " ");
            }
        };

        button.addActionListener(ae);

    }

}





