package com.view;

import com.controller.MainController;
import com.model.Type;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HViewCheck {
    private JComboBox typeComboBox;
    private JPanel panel1;
    private JButton checkAvailableButton;
    private JButton checkOccupiedButton;


    public HViewCheck(MainController controller) {
        for (Type type :
                Type.values()) {
            typeComboBox.addItem(type);
        }
        typeComboBox.updateUI();

        checkAvailableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controller.checkAvailable((Type) typeComboBox.getSelectedItem());

            }
        });
        checkOccupiedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.checkOccupied((Type) typeComboBox.getSelectedItem());

            }
        });
    }



    public static void launch(MainController controller){

        JFrame frame = new JFrame("HViewCheck");
        frame.setContentPane(new HViewCheck( controller).panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);

    }
}
