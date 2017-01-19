package com.view;

import com.controller.BDDController;
import com.model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

/**
 * @author Etudes
 * @since 19/01/2017.
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

                Date date=null;
                try {
                    if (birthDateTextField.getText() != null) {

                        date = Date.valueOf(birthDateTextField.getText());

                    }

                    Person newPerson = new Person(firstNameFormattedTextField.getText(),lastNameTextField.getText(),date ,phoneNumberTextField.getText());
                    BDDController.persist(newPerson);
                    BDDController.commit();
                    JOptionPane.showMessageDialog(null, "Person created sucessfully","Information",JOptionPane.INFORMATION_MESSAGE);

                }catch (IllegalArgumentException e1){
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Date is in the wrong format","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }




}
