package com.company;

public class Point {
    private double x, y;
    private double [][] vector = new double[1][];


    public Point(double x, double y) {
        vector[0] = new double[3];

        this.x = x;
        this.vector[0][0] = x;

        this.y = y;
        this.vector[0][1] = x;

        this.vector[0][2] = x;

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double newX) {
        this.x = newX;
        this.vector[0][0] = newX;
    }

    public void setY(double newY) {
        this.y = newY;
        this.vector[0][1] = newY;
    }

    public double[][] createChangingMatrix(double a, double b, double c, double d) {
        double[][] result = {
            {a, b, 0},
            {c, d, 0},
            {0, 0, 1}
        };

        return result;
    }

    public void changeEvenly(double coefficient) {
        change(coefficient, coefficient);
    }

    public void change(double a, double d) {

        double[][] changeMatrix = createChangingMatrix(a, 0, 0, 1);
        try {
            this.vector = Utills.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0][0];
            this.y = vector[0][1];

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void rotate(int degrees) {
        double[][] changeMatrix = createChangingMatrix(
                Math.cos(Math.toRadians(degrees)), Math.sin(Math.toRadians(degrees)),
                - Math.sin(Math.toRadians(degrees)), Math.cos(Math.toRadians(degrees))
        );
        try {
            this.vector = Utills.multiplyMatrix(this.vector, changeMatrix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
