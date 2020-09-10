package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton move = new JButton("Move");
    private JButton left = new JButton("left");
    private JButton right = new JButton("right");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");

    public MainFrame() throws HeadlessException {
        Container container = new Container();
        container.setSize(600, 800);

        DrawPanel dp = new DrawPanel();
        dp.setSize(400, 400);
        dp.setLocation(100, 100);

        container.add(dp);
        this.add(container);

        dp.add(move);
        dp.add(left);
        dp.add(right);
        dp.add(plus);
        dp.add(minus);

        move.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    dp.repaint();
                }
            });

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dp.repaint();
            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dp.repaint();
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dp.repaint();
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dp.repaint();
            }
        });
    }

}
