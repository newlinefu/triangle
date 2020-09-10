package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    Triangle tr = new Triangle();
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.BLACK);

    }


    public void drawLineWithKey(int x, int y, Graphics g) {
        drawLine(g, x, y);
    }

    public void drawLine(Graphics g, int x, int y) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.drawLine(50, 50, x, y);
    }

    public void rotateMinus() {

        repaint();
    }


}
