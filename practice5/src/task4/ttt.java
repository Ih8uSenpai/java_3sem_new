package task4;

import javax.swing.*;
import java.awt.*;

public class ttt {
    public static void main(String[] args) {
        JFrame frame = new JFrame("frame1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setPreferredSize(new Dimension(200, 300));
        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
