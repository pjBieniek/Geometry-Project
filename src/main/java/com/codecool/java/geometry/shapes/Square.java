package com.codecool.java.geometry.shapes;

import java.text.DecimalFormat;

public class Square extends Shape {
    private float a;
    private boolean isValid;
    private double area;
    private double perimeter;

    public Square(float a) {
        this.a = a;
        isValid = checkIfArgsGreaterThanZero(a);
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
        double result = (this.a * this.a);
        return result;
    }

    public double calculatePerimeter() {
        double result = (4*this.a);
        return result;
    }

    public String getAreaFormula() {
        String area = "a×a";
        return area;
    }

    public String getPerimeterFormula() {
        String perimeter = "4×a";
        return perimeter;
    }

    public boolean checkIfArgsGreaterThanZero(float a) {
        if (this.a < 0) {
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
        return "Square";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Square, a = " + df.format(getA());
    }
}
