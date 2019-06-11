package com.codecool.java.geometry.shapes;

import java.text.DecimalFormat;

public class Circle extends Shape {
    private float r;
    private boolean isValid;
    private double area;
    private double perimeter;



    public Circle(float r){
        this.r = r;
        isValid = checkIfArgsGreaterThanZero(r);
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double calculateArea() {
        double result = (Math.PI * this.r * this.r);
        return result;
    }

    public double calculatePerimeter() {
        double result = (2 * Math.PI * this.r);
        return result;
    }

    public String getAreaFormula() {
        String area = "π×r×r";
        return area;
    }

    public String getPerimeterFormula() {
        String perimeter = "2π×r";
        return perimeter;
    }

    public boolean checkIfArgsGreaterThanZero(float r) {
        if (this.r < 0) {
            throw new IllegalArgumentException();
        } else {
            return true;
        }
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
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
        return "Circle";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Circle, r = " + df.format(getR());
    }
}
