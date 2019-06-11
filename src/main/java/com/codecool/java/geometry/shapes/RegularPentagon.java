package com.codecool.java.geometry.shapes;

import java.text.DecimalFormat;

public class RegularPentagon extends Shape {
    private float a;
    private boolean isValid;
    private double area;
    private double perimeter;

    public RegularPentagon(float a) {
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
        double result = (this.a*this.a*Math.sqrt(5*(5+2*Math.sqrt(5))))/4;
        return result;
    }

    public double calculatePerimeter() {
        double result = (5*this.a);
        return result;
    }

    public String getAreaFormula() {
        String area = "(a*a * sqrt(5(5+2sqrt(5))))/4";
        return area;
    }

    public String getPerimeterFormula() {
        String perimeter = "5×a";
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
        return "RegularPentagon";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "RegularPentagon, a = " + df.format(getA());
    }
}
