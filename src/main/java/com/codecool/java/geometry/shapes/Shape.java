package com.codecool.java.geometry.shapes;


import com.codecool.java.NotYetImplementedException;

/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
    String shapeName;
    double area;
    double perimeter;
    int index;

    public Shape(){
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Calculates shape's area.
     * @return area of the shape
     */
    public abstract double calculateArea();

    /**
     * Calculates shape's perimeter.
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Returns formula for the area of the shape as a string.
     * @return area formula
     */
    public abstract String getAreaFormula();
    
    /**
     * Returns formula for the perimeter of the shape as a string.
     * @return perimeter formula
     */
    public abstract String getPerimeterFormula();


    @Override
    public String toString() {
        return getShapeName() + ", ";
    }

    /**
     * Check if any of args are not below 0.
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     * @param args
     * @return true if any of args are greater than 0
     */
    public static boolean checkIfArgsGreaterThanZero(float... args) {
        throw new NotYetImplementedException();
    }

    /**
     * @return the shapeName
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * @param shapeName the shapeName to set
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
