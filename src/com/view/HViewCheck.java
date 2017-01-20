package com.view;

import com.controller.MainController;
import com.model.City;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HViewCheck {
    private JComboBox cityComboBox;
    private JPanel panel1;
    private JButton checkAvailableButton;
    private JButton checkOccupiedButton;


    public HViewCheck(java.util.List<City> cities, MainController controller) {
        for (City city :
                cities) {
            cityComboBox.addItem(city);
            System.out.println(city);
        }
        cityComboBox.updateUI();

        checkAvailableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controller.checkAvailable((City)cityComboBox.getSelectedItem());

            }
        });
        checkOccupiedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.checkOccupied((City)cityComboBox.getSelectedItem());

            }
        });
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("HViewCheck");
//        frame.setContentPane(new HViewCheck().panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }



    public static void launch(List<City> cities, MainController controller){

        JFrame frame = new JFrame("HViewCheck");
        frame.setContentPane(new HViewCheck(cities, controller).panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);

    }
}
