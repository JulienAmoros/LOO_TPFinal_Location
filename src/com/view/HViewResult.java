package com.view;

import com.controller.BDDController;
import com.model.Housing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HViewResult {
    private JList list1;
    private JPanel panel1;
    private JButton markBouton;



    public HViewResult(List list, boolean empty){
        list1.setListData(new Vector(list));
        list1.updateUI();
        markBouton.setVisible(!empty);


        markBouton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list1.getSelectedValue() != null) {
                    Housing housing = (Housing)list1.getSelectedValue();
                    housing.setHosts(null);
                    list.remove(housing);
                    BDDController.commit();
                }
                list1.setListData(new Vector(list));
                list1.updateUI();
            }
        });
    }



    public static void launch(List list, boolean empty){

        JFrame frame = new JFrame("HViewResult");
        frame.setContentPane(new HViewResult(list,empty).panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension(500,500);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);

    }

}
