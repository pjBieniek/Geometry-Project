package com.codecool.java.geometry.shapes;

import java.text.DecimalFormat;

public class EquilateralTriangle extends Shape {
    private float a, b, c;
    private boolean isValid;
    private double area;
    private double perimeter;

    public EquilateralTriangle(float a) {
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
        double s = (this.a + this.b + this.c)/2;
        Double result = (Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c)));
        if (result.isNaN()){
            setValid(false);
        }
        return result;
    }

    public double calculatePerimeter() {
        double result = (this.a + this.b + this.c);
        return result;
    }

    public String getAreaFormula() {
        String area = "sqrt(s(s-a)(s-b)(s-c)), where s = (a+b+c)/2 ";
        return area;
    }

    public String getPerimeterFormula() {
        String perimeter = "a + b + c";
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
        return "EquilateralTriangle";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "EquilateralTriangle, a = " + df.format(getA()) +
                "b = " + df.format(getB()) +
                "c = " + df.format(getC());
    }
}
