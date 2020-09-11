package com.company;

public class Point {

    public double x, y;

    //массив двумерный для возможности перемножения матриц
    public double [][] vector = new double[1][];


    public Point(double x, double y) {
        vector[0] = new double[3];

        this.x = x;
        this.vector[0][0] = x;

        this.y = y;
        this.vector[0][1] = y;

        //{x, y, 1}
        this.vector[0][2] = 1;

    }

    public void setX(double newX) {
        this.x = newX;
        this.vector[0][0] = newX;
    }

    public void setY(double newY) {
        this.y = newY;
        this.vector[0][1] = newY;
    }

    //[a b 0]
    //[c d 0]
    //[0 0 1]
    public double[][] createChangingMatrix(double a, double b, double c, double d) {
        double[][] result = {
            {a, b, 0},
            {c, d, 0},
            {0, 0, 1}
        };

        return result;
    }

    //Метод изменения масштаба (равномерно)
    public void changeEvenly(double coefficient) {
        change(coefficient, coefficient);
    }

    //Метод изменения масштаба (неравномерно)
    public void change(double a, double d) {

        double[][] changeMatrix = createChangingMatrix(a, 0, 0, d);
        try {
            this.vector = Utils.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0][0];
            this.y = vector[0][1];

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Метод поворота точки
    public void rotate(int degrees) {
        double[][] changeMatrix = createChangingMatrix(
                Math.cos(Math.toRadians(degrees)), Math.sin(Math.toRadians(degrees)),
                - Math.sin(Math.toRadians(degrees)), Math.cos(Math.toRadians(degrees))
        );
        try {
            this.vector = Utils.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0][0];
            this.y = vector[0][1];

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "X: " + this.x + " Y: " + this.y;
    }
}
