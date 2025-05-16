package shapes;

import java.util.Scanner;

/**
 * Filename: Ellipse.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * Last Updated: 26 Apr 2024
 */
public class Ellipse implements ShapeIO {

    private double major = 0, minor = 0;

    /**
     * Creates a new ellipse object
     */
    public Ellipse() {}

    @Override
    /**
     * Asks the user for the dimensions and updates the instance variables
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the major axis length?");
        major = scanner.nextDouble();
        System.out.println("What is the minor axis length?");
        minor = scanner.nextDouble();
    }

    @Override
    /**
     * Returns the area of the ellipse
     * 
     * @return area
     */
    public double getArea() {
        return Math.PI * major * minor;
    }

    @Override
    /**
     * Returns the perimeter of the ellipse
     * 
     * @return perimeter
     */
    public double getPerimeter() {
        return Math.PI * (major + minor) * 
            (3  * (Math.pow(major - minor, 2) 
                / (Math.pow(major + minor, 2) 
                    * (Math.sqrt(
                        -3 * (Math.pow(major - minor, 2) 
                            / Math.pow(major + minor, 2)) 
                        + 4)
                    + 10))) 
            + 1);
    }
}

