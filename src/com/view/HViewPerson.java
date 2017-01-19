package com.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Etudes on 19/01/2017.
 */
public class HViewPerson extends JFrame {



    private JButton okButton;
    private JPanel panel1;
    private JFormattedTextField firstNameFormattedTextField;
    private JTextField lastNameTextField;
    private JTextField phoneNumberTextField;
    private JTextField birthDateTextField;





    public static void main(String[] args) {
        JFrame frame = new JFrame("HViewPerson");
        frame.setContentPane(new HViewPerson().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void launch(){
        JFrame frame = new JFrame("HViewPerson");
        frame.setContentPane(new HViewPerson().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);
    }



    public HViewPerson() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {








                JOptionPane jop1;
                jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "Person created sucessfully","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }




}
