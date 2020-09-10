package com.company;

import java.awt.*;

public class Line {
    private Point first, second;


    public Line(double x1, double y1, double x2, double y2) {
        first = new Point(x1, y1);
        second = new Point(x2, y2);
    }


    public void move(double x, double y) {
        first.setX(first.getX() + x);
        first.setY(first.getY() + y);

        second.setX(second.getX() + x);
        second.setY(second.getY() + y);
    }

    public void change(double a, double b) {
        double xChange = first.getX(), yChange = first.getY();
        move(-xChange, -yChange);
        first.change(a, b);
        second.change(a, b);
        move(xChange, yChange);
    }

    public void changeEvenly(double coefficient) {
        change(coefficient, coefficient);
    }

    public void rotate(int degrees) {
        double xChange = first.getX(), yChange = first.getY();
        move(-xChange, -yChange);
        first.rotate(degrees);
        second.rotate(degrees);
        move(xChange, yChange);
    }

    public void draw(Graphics g) {
        g.drawLine((int)first.getX(), (int)first.getY(), (int)second.getX(), (int)second.getY());
    }
}
