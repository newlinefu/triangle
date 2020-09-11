package com.company;

import java.awt.*;

public class Triangle {
    public Line a, b, c;

    public Triangle() {
        this.a = new Line(50, 50, 50, 100);
        this.b = new Line(50, 100, 70, 50);
        this.c = new Line(70, 50, 50, 50);
    }

    public void change(double a, double b) {

        Point movePoint = new Point(this.a.first.x, this.a.first.y);

        moveAll(-movePoint.x, -movePoint.y);
        this.a.change(a, b);
        this.b.change(a, b);
        this.c.change(a, b);
        moveAll(movePoint.x, movePoint.y);
    }

    public void changeEvenly(double coefficient) {
        change(coefficient, coefficient);
    }

    public void rotate(int degrees) {

        Point movePoint = new Point(this.a.first.x, this.a.first.y);
        moveAll(-movePoint.x, -movePoint.y);
        this.a.rotate(degrees);
        this.b.rotate(degrees);
        this.c.rotate(degrees);
        moveAll(movePoint.x, movePoint.y);
    }

    public void moveAll(double x, double y) {
        this.a.move(x, y);
        this.b.move(x, y);
        this.c.move(x, y);
    }

    public void drawTriangle(Graphics g) {
        this.a.draw(g);
        this.b.draw(g);
        this.c.draw(g);
    }

    public String toString() {
        return "x1="+ this.a.second.x +",y1=" + this.a.second.y
                + ",x2=" + this.b.second.x + ",y2=" + this.b.second.y
                + ",x3=" + this.c.second.x + ",y3=" + this.c.second.y;
    }
}
