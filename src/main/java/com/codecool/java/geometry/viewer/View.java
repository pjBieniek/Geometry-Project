package com.codecool.java.geometry.viewer;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.Shape;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class View {

    public List<List<String>> shapesToString(List<Shape> shapes) {
        DecimalFormat df = new DecimalFormat("#.##");
        List<List<String>> list = new ArrayList<>();
        for (Shape shape : shapes) {
            List<String> temp = new ArrayList<>();
            temp.add(String.valueOf(shape.getIndex()));
            temp.add(shape.getShapeName());
            temp.add(shape.toString());
            temp.add(String.valueOf(df.format(shape.getPerimeter())));
            temp.add(shape.getPerimeterFormula());
            temp.add(String.valueOf(df.format(shape.getArea())));
            temp.add(shape.getAreaFormula());
            list.add(temp);
        }
        return list;
    }

    public void displayTable(List<List<String>> table){
        List<String> headers = new ArrayList<>();
        headers.add("idx");
        headers.add("Class");
        headers.add("toString");
        headers.add("Perimeter");
        headers.add("Formula");
        headers.add("Area");
        headers.add("Formula");
        PrintTable newTable = new PrintTable(headers,  table , false);
        String tableToPrint = newTable.printTable();
        System.out.println((tableToPrint));
    }
}
