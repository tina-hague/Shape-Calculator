package shapes;

import java.util.Scanner;

/**
 * Filename: Cylinder.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * Last Updated: 26 Apr 2024
 */
public class Cylinder implements ShapeIO {

    private double radius = 0, height = 0;

    /**
     * Creates a new cylinder object
     * 
     */
    public Cylinder() {}

    @Override
    /**
     * Asks the user for the dimensions and updates the instance variables
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the radius of the base of your cylinder?");
        radius = scanner.nextDouble();
        System.out.println("And the height?");
        height = scanner.nextDouble();
    }

    @Override
    /**
     * Returns the volume of the cylinder
     * 
     * @return volume
     */
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    /**
     * Returns the surface area of the cylinder
     * 
     * @return surface area
     */
    public double getSurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }
}