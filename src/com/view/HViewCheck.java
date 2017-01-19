package com.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Etudes on 19/01/2017.
 */
public class HViewCheck {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JButton checkAvailableButton;
    private JButton checkOccupiedButton;


    public HViewCheck() {
        checkAvailableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {








                HViewResult hviewresult = new HViewResult();
                hviewresult.launch();
            }
        });
        checkOccupiedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {









                HViewResult hviewresult = new HViewResult();
                hviewresult.launch();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HViewCheck");
        frame.setContentPane(new HViewCheck().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    public static void launch(){

        JFrame frame = new JFrame("HViewCheck");
        frame.setContentPane(new HViewCheck().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);

    }
}
