package shapes;

import java.util.Scanner;

/**
 * Filenamne: Polygon.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * Last Updated: 26 Apr 2024
 */
public class Polygon implements ShapeIO {

    private double sideLength = 0;
    private int sides = 0;

    /**
     * Creates a new polygon object
     */
    public Polygon() {}

    @Override
    /**
     * Ask the user for the dimensions and updates the instance variables
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner) {
        System.out.println("How many sides does your polygon have?");
        sides = scanner.nextInt();
        System.out.println("What is the side length?");
        sideLength = scanner.nextDouble();
    }

    @Override
    /**
     * Returns the apothem length of the polygon
     * 
     * @return apothem
     */
    public double getApothem() {
        return sideLength / 2 * Math.tan(180/sides);
    }

    @Override
    /**
     * Returns the perimeter of the polygon
     * 
     * @return perimeter
     */
    public double getPerimeter() {
        return sideLength * sides;
    }

    @Override
    public double getArea() {
        return (getApothem() * getPerimeter()) / 2;
    }
}
