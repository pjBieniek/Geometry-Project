package com.codecool.java.geometry.containers;

import com.codecool.java.geometry.shapes.Shape;
import com.codecool.java.geometry.viewer.View;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {
     private List<Shape> shapes;
     private View viewer;
     private int index = 0;
     public ShapeList(){
         shapes = new ArrayList<>();
     }

     public void addShape(Shape shape){
         shape.setIndex(index);
         shapes.add(shape);
         index++;
     }

     public Shape getShapeAt(int index){
         return shapes.get(index);
     }

     public List<Shape> getShapesTable(){
        return shapes;
     }

     public Shape getLargestShapeByPerimeter(){
         int largestsId = 0;
         int index = 0;
         for (Shape shape : shapes){
             if (shapes.get(largestsId).getArea() < shape.getArea()){
                 largestsId = index;
                 index++;
             }
         }
         return shapes.get(largestsId);
     }

     public Shape getLargestShapeByArea(){
         int largestsId = 0;
         int index = 0;
         for (Shape shape : shapes){
             if (shapes.get(largestsId).getArea() < shape.getArea()){
                 largestsId = index;
                 index++;
             }
         }
         return shapes.get(largestsId);
     }
}
