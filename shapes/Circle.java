package shapes;

import java.util.Scanner;

/**
 * Filename: Circle.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * last Updated: 26 Apr 2024
 */
public class Circle implements ShapeIO {

    private double radius = 0;

    /**
     * Creates a new circle object
     */
    public Circle() {}

    @Override
    /**
     * Asks the user for the radius and changes the instance variable
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the radius of the circle?");
        radius = scanner.nextDouble();
    }

    @Override
    /**
     * Returns the area of the circle
     * 
     * @return area
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2); 
    }

    @Override
    /**
     * Returns the perimeter of the circle
     * 
     * @return perimeter
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
