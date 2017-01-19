package com.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Etudes on 19/01/2017.
 */
public class HView1 {


    private JPanel panel1;
    private JButton addPersonButton;
    private JButton appHousingButton;
    private JButton addTownButton;
    private JButton addDistrictButton;
    private JButton checkHousingButton;
    private JButton registerPersonOnHousingButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("HView1");
        frame.setContentPane(new HView1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = new Dimension(400,600);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setVisible(true);
    }






    public HView1() {
        addPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               HViewPerson hviewpersonn = new HViewPerson();
               hviewpersonn.launch();


            }
        });



        appHousingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HViewHousing hviewhousing = new HViewHousing();
                hviewhousing.launch();

            }
        });


        addTownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                HViewTown hviewtown = new HViewTown();
                hviewtown.launch();

            }
        });


        addDistrictButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HViewDistrict hviewdistrict = new HViewDistrict();
                hviewdistrict.launch();
            }
        });



        checkHousingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HViewCheck hviewcheck = new HViewCheck();
                hviewcheck.launch();
            }
        });


        registerPersonOnHousingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                HViewRegister hviewregister = new HViewRegister();
                hviewregister.launch();
            }
        });
    }







}
