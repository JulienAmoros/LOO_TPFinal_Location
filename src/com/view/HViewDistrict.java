package com.view;

import com.controller.BDDController;
import com.model.City;
import com.model.District;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HViewDistrict {
    private JTextField nameTextField;
    private JPanel panel1;
    private JButton okButton;
    private JComboBox cityComboBox;


    public HViewDistrict(List<City> cities) {

        for (City city :
                cities) {
            cityComboBox.addItem(city);
        }
        cityComboBox.updateUI();
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add District


                District district = new District(nameTextField.getText(),(City) cityComboBox.getSelectedItem());
                BDDController.persist(district);
                BDDController.commit();
                JOptionPane.showMessageDialog(null, "District's creation successful","Information",JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("HViewDistrict");
//        frame.setContentPane(new HViewDistrict().panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }


    public static void launch(List<City> cities){
        JFrame frame = new JFrame("HViewDistrict");
        frame.setContentPane(new HViewDistrict(cities).panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);
    }

}
