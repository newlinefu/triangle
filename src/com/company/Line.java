package com.company;

import java.awt.*;

public class Line {
    public Point first, second;

    public Line(double x1, double y1, double x2, double y2) {
        first = new Point(x1, y1);
        second = new Point(x2, y2);
    }

    public void move(double x, double y) {
        first.setX(first.x + x);
        first.setY(first.y + y);

        second.setX(second.x + x);
        second.setY(second.y + y);
    }

    //Изменение масшата(Неравномерно)
    public void change(double a, double b) {
        first.change(a, b);
        second.change(a, b);
    }
    //Изменение масшата(равномерно)
    public void changeEvenly(double coefficient) {
        change(coefficient, coefficient);
    }

    //Поворот
    public void rotate(int degrees) {
        first.rotate(degrees);
        second.rotate(degrees);
    }

    public String toString() {
       return "x1: " + this.first.x + " y1: " + this.first.y +
               "\nx2: " + this.second.x + "y2: " + this.second.y + "\n";
    }

    public void draw(Graphics g) {
        g.drawLine((int)first.x, (int)first.y, (int)second.x, (int)second.y);
    }
}
