package shapes;

import java.util.Scanner;

/**
 * Filename: Cone.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * Last Updated: 26 Apr 2024
 */
public class Cone implements ShapeIO {
    
    private double radius = 0, height = 0;

    /**
     * Creates a new cone object.
     */
    public Cone () {}

    @Override
    /**
     * Asks the user for the dimensions and updates the instance variables
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the radius of the base of your cone?");

        radius = scanner.nextDouble();

        System.out.println("What is the height of your cone?");

        height = scanner.nextDouble();
    }
    
    @Override
    /**
     * Returns the surface area of the cone
     * 
     * @return surface area
     */
    public double getSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    /**
     * Returns the volume of the cone
     * 
     * @return volume
     */
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}