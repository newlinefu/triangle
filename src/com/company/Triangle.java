package com.company;

import java.awt.*;

public class Triangle {
    public Line a, b, c;

    public Triangle() {
        a = new Line(1, 1, 1, 3);
        b = new Line(1, 3, 2, 1);
        c = new Line(2, 1, 1, 1);
    }

    public Line getPointA() {
        return this.a;
    }

    public Line getPointB() {
        return this.b;
    }

    public Line getPointC() {
        return this.c;
    }

    public void setPointA(double x1, double y1, double x2, double y2) {
        this.a = new Line(x1, y1, x2, y2);
    }

    public void setPointB(double x1, double y1, double x2, double y2) {
        this.b = new Line(x1, y1, x2, y2);
    }

    public void setPointC(double x1, double y1, double x2, double y2) {
        this.c = new Line(x1, y1, x2, y2);
    }

    public void change(double a, double b) {
        this.a.change(a, b);
        this.b.change(a, b);
        this.c.change(a, b);
    }

    public void changeEvenly(double coefficient) {
        change(coefficient, coefficient);
    }

    public void rotate(int degrees) {
        this.a.rotate(degrees);
        this.b.rotate(degrees);
        this.c.rotate(degrees);
    }

    public void drawTriangle(Graphics g) {
        a.draw(g);
        b.draw(g);
        c.draw(g);
    }
}
