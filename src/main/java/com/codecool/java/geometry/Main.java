package com.codecool.java.geometry;
import java.util.Scanner;
import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.Circle;
import com.codecool.java.geometry.shapes.EquilateralTriangle;
import com.codecool.java.geometry.shapes.Rectangle;
import com.codecool.java.geometry.shapes.RegularPentagon;
import com.codecool.java.geometry.shapes.Square;
import com.codecool.java.geometry.shapes.Triangle;
import com.codecool.java.geometry.viewer.View;

public class Main {

    public static void main(String[] args) {
        View viewer = new View();
	    ShapeList shapes = new ShapeList();
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        // TODO: implement user interaction here. You can change the code below
	    while (isRunning) {
            displayMenu();
	        int option = scanner.nextInt(); // TODO: get option from user

            switch (option) {
                case 1:
                    handleFirstOption(shapes, viewer);
                    break;
                case 2:
                    viewer.displayTable(viewer.shapesToString(shapes.getShapesTable()));
                    break;
                case 3:
                    handleThirdOption();
                    break;
                case 4:
                    handleFourthOption();
                    break;
                case 5:
                    handleFifthOption();
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 

    private static void displayMenu(){
        clearScreen();
        System.out.println("Learn geometry. What do you want to do?");
        System.out.println("(1) Add new shape");
        System.out.println("(2) Show all shapes");
        System.out.println("(3) Show shape with largest perimeter");
        System.out.println("(4) Show shape with largest area");
        System.out.println("(5) Show formulas");
        System.out.println("(0) Exit program");
    }

    private static void handleFirstOption(ShapeList shape, View view) {
        boolean backToMain = false;

        while (!backToMain){
            Scanner scanner = new Scanner(System.in);
            clearScreen();
            System.out.println("\n\nEnter new shape: ");
            System.out.println("Circle \n Triangle \n Equilateral Triangle \n Regular Pentagon \n Rectangle \n Square \n If want to go back, type: 0");
            String shapeName = scanner.nextLine();
            switch (shapeName) {
                case "Circle":
                    System.out.println("Enter radius : ");
                    float r = scanner.nextFloat();
                    Circle newCircle = new Circle(r); // add it to ShapeList
                    if (newCircle.isValid()){
                        shape.addShape(newCircle);
                    }
                    break;
                case "Triangle":
                    System.out.println("Enter side's length: ");
                    float a1 = scanner.nextFloat();
                    System.out.println("Enter 2 side's length: ");
                    float b1 = scanner.nextFloat();
                    System.out.println("Enter 3 side's length: ");
                    float c1 = scanner.nextFloat();
                    Triangle newTriangle = new Triangle(a1, b1, c1);
                    if (newTriangle.isValid()){
                        shape.addShape(newTriangle);
                    }
                    break;
                case "Equilateral Triangle":
                    System.out.println("Enter side's length : ");
                    float a2 = scanner.nextFloat();
                    EquilateralTriangle newEquilateralTriangle = new EquilateralTriangle(a2); // add it to ShapeList
                    if (newEquilateralTriangle.isValid()){
                        shape.addShape(newEquilateralTriangle);
                    }
                    break;
                case "Regular Pentagon":
                    System.out.println("Enter side's length : ");
                    float a3 = scanner.nextFloat();
                    RegularPentagon newRegularPentagon = new RegularPentagon(a3) ; // add it to ShapeList
                    if (newRegularPentagon.isValid()){
                        shape.addShape(newRegularPentagon);
                    }
                    break;
                case "Rectangle":
                    System.out.println("Enter side's length : ");
                    float a4 = scanner.nextFloat();
                    System.out.println("Enter 2 side's length : ");
                    float b4 = scanner.nextFloat();
                    Rectangle newRectangle = new Rectangle(a4, b4) ; // add it to ShapeList
                    if (newRectangle.isValid()){
                        shape.addShape(newRectangle);
                    }
                    break;
                case "Square":
                    System.out.println("Enter side's length : ");
                    float a5 = scanner.nextInt();
                    Square newSquare = new Square(a5); // add it to ShapeList
                    if (newSquare.isValid()){
                        shape.addShape(newSquare);
                    }
                    break;
                case "0":
                    backToMain = true;
            }

        }

    }

    private static void handleSecondOption() {

    }

    private static void handleThirdOption() {

    }

    private static void handleFourthOption() {

    }

    private static void handleFifthOption() {

    }
}
