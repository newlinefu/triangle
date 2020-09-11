package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {


    private JButton left = new JButton("left");
    private JButton right = new JButton("right");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");

    public MainFrame() throws HeadlessException {

        DrawPanel dp = new DrawPanel();
        dp.setSize(600, 800);
        dp.setLocation(0, 0);
        this.add(dp);

        dp.add(left);
        dp.add(right);
        dp.add(plus);
        dp.add(minus);

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dp.rotateLeft();
            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dp.rotateRight();
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {dp.transformPlus();}
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dp.transformMinus();
            }
        });
    }

}
