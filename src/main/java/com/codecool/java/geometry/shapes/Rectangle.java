package com.codecool.java.geometry.shapes;

import java.text.DecimalFormat;

public class Rectangle extends Shape {
    private float a, b;
    private boolean isValid;
    private double area;
    private double perimeter;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
        isValid = checkIfArgsGreaterThanZero(a, b);
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
        return (this.a * this.b);
//        return result;
    }

    public double calculatePerimeter() {
        return (2*this.a + 2*this.b);
//        return result;
    }

    public String getAreaFormula() {
        return "a×b";
//        return area;
    }

    public String getPerimeterFormula() {
        return "2×a + 2×b";
//        return perimeter;
    }

    private static boolean checkIfArgsGreaterThanZero(float a, float b) {
        if (a < 0 || b < 0) {
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
        return "Rectangle";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Rectangle, a = " + df.format(getA()) +
                "b = " + df.format(getB());
    }
}
