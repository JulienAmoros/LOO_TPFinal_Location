package com.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Etudes on 19/01/2017.
 */
public class HViewDistrict {
    private JTextField nameTextField;
    private JPanel panel1;
    private JButton okButton;
    private JComboBox comboBox1;


    public HViewDistrict() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //add District










                JOptionPane jop1;
                jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "District created sucessfully","Information",JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HViewDistrict");
        frame.setContentPane(new HViewDistrict().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void launch(){
        JFrame frame = new JFrame("HViewDistrict");
        frame.setContentPane(new HViewDistrict().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);
    }

}
