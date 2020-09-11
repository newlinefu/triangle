package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    Triangle tr = new Triangle();
    private static final int angle = 30;
    private static final double coefficient = 1.5;

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.BLACK);
        gr.clearRect(0, 0, getWidth(), getHeight());
        tr.drawTriangle(gr);
    }



    public void rotateRight() {
        tr.rotate(-angle);
        repaint();
    }

    public void rotateLeft() {
        tr.rotate(angle);
        repaint();
    }

    public void transformMinus() {
        tr.changeEvenly(1 / coefficient);
        repaint();
    }

    public void transformPlus() {
        tr.changeEvenly(coefficient);
        repaint();
    }


}
