package shapes;

import java.util.Scanner;

/**
 * Filename: Sphere.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * Last Updated: 26 Apr 2024
 */
public class Sphere implements ShapeIO{

    double radius = 0;
    
    /**
     * Creates a new sphere object
     */
    public Sphere() {}

    @Override
    /**
     * Asks the user for the dimensions then updates the instance variables
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner) {
        System.out.print("What is the radius of the sphere?");
        radius = scanner.nextDouble();
    }
    
    @Override
    /**
     * Returns the volume of the sphere
     * 
     * @return volume
     */
    public double getVolume() {
        return (Math.PI * Math.pow(radius, 3) * 4) / 3;
    }

    @Override
    /**
     * Returns the surface area of the sphere
     * 
     * @return surface area
     */
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
