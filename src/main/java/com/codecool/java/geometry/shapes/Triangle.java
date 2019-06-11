package com.codecool.java.geometry.shapes;

import java.text.DecimalFormat;

public class Triangle extends Shape {
    private float a, b, c;
    private boolean isValid;
    private double area;
    private double perimeter;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.isValid = checkIfArgsGreaterThanZero(a, b, c);
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double calculateArea() {
        double result = (this.a*this.a * Math.sqrt(3))/4;
        return result;
    }

    public double calculatePerimeter() {
        double result = (3 * this.a);
        return result;
    }

    public String getAreaFormula() {
        String area = "(a×a×sqrt(4))/3 ";
        return area;
    }

    public String getPerimeterFormula() {
        String perimeter = "3×a";
        return perimeter;
    }

    public boolean checkIfArgsGreaterThanZero(float a, float b, float c) {
        if (this.a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException();
        } else {
            return true;
        }
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * @return the isValid
     */
    public boolean isValid() {
        return isValid;
    }

    /**
     * @param isValid the isValid to set
     */
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Triangle, a = " + df.format(getA()) +
                ", b = " + df.format(getB()) +
                ", c = " + df.format(getC());
    }
}
