package com.view;
import com.controller.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author Etudes
 * @since 19/01/2017.
 */
public class HView1 extends JFrame{


    private JPanel panel1;
    private JButton addPersonButton;
    private JButton appHousingButton;
    private JButton addTownButton;
    private JButton addDistrictButton;
    private JButton checkHousingButton;
    private JButton registerPersonOnHousingButton;


//    public static void main(String[] args) {
//        JFrame frame = new JFrame("HView1");
//        frame.setContentPane(new HView1().panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Dimension dim = new Dimension(400,600);
//        frame.setPreferredSize(dim);
//        frame.pack();
//        frame.setVisible(true);
//    }
//





    public HView1(MainController controller) {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = new Dimension(400,600);
        setPreferredSize(dim);
        pack();
        setVisible(true);

        addPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               HViewPerson.launch();


            }
        });



        appHousingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.startNewHousing();
            }
        });


        addTownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                HViewTown hviewtown = new HViewTown();
                HViewTown.launch();

            }
        });


        addDistrictButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HViewDistrict hviewdistrict = new HViewDistrict();
                HViewDistrict.launch();
            }
        });



        checkHousingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HViewCheck hviewcheck = new HViewCheck();
                HViewCheck.launch();
            }
        });


        registerPersonOnHousingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                HViewRegister hviewregister = new HViewRegister();
                HViewRegister.launch();
            }
        });
    }







}
