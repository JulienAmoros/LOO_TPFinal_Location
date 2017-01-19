package com.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HViewResult {
    private JList list1;
    private JPanel panel1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("HViewResult");
        frame.setContentPane(new HViewResult().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void launch(){

        JFrame frame = new JFrame("HViewResult");
        frame.setContentPane(new HViewResult().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);

    }

}