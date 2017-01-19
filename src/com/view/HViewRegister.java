package com.view;

import com.controller.MainController;
import com.model.Housing;
import com.model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HViewRegister {
    private JComboBox tenantComboBox;
    private JPanel panel1;
    private JButton registerButton;
    private JComboBox housingCombobox;


    public HViewRegister(List<Housing> housings, List<Person> people, MainController controller) {
        for (Housing housing :
                housings) {
            housingCombobox.addItem(housing);
        }
        for (Person person :
                people) {
            tenantComboBox.addItem(person);
        }
        housingCombobox.updateUI();
        tenantComboBox.updateUI();

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                controller.setRegistering((Housing)housingCombobox.getSelectedItem(),(Person)tenantComboBox.getSelectedItem());





                JOptionPane.showMessageDialog(null, "Registration done","Information",JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("HViewRegister");
//        frame.setContentPane(new HViewRegister().panel1);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        Dimension dim = new Dimension(300,500);
//        frame.setPreferredSize(dim);
//        frame.pack();
//        frame.setVisible(true);
//    }

    public static void launch(List<Housing> housings, List<Person> people, MainController controller){
        JFrame frame = new JFrame("HViewRegister");
        frame.setContentPane(new HViewRegister(housings, people, controller).panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(500,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);


    }
}
