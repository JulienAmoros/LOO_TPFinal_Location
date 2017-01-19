package com.view;

import com.controller.BDDController;
import com.model.City;
import com.model.District;
import com.model.Housing;
import com.model.Type;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HViewHousing {
    private JPanel panel1;
    private JTextField addressTextField;
    private JTextField rentTextField;
    private JTextField surfaceTextField;
    private JButton okButton;
    private JComboBox districtComboBox;
    private JComboBox typeComboBox;


    public HViewHousing(List<District> districts) {

        for (District district :
                districts) {
            districtComboBox.addItem(district);
        }

        for (Type type :
                Type.values()) {
            typeComboBox.addItem(type);
        }
        districtComboBox.updateUI();
        typeComboBox.updateUI();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Housing housing = new Housing((District)districtComboBox.getSelectedItem(),
                                    Double.parseDouble(rentTextField.getText()),
                                    Double.parseDouble(surfaceTextField.getText()),
                                    addressTextField.getText(),
                                    null,
                                    (Type)typeComboBox.getSelectedItem());
                    BDDController.persist(housing);
                    BDDController.commit();
                    JOptionPane.showMessageDialog(null, "Housing created sucessfully","Information",JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Wrong number format","Error",JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }
            }
        });
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("HViewHousing");
//        frame.setContentPane(new HViewHousing().panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }

    public static void launch(List<District> districts){

        JFrame frame = new JFrame("HViewHousing");
        frame.setContentPane(new HViewHousing(districts).panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(300,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);

    }


}
