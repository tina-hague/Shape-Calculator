package shapes;

import java.util.Scanner;

/**
 * Filename: ShapeIO.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * Last Updated: 26 Apr 2024
 */
public interface ShapeIO {

    /**
     * Asks the user for the dimensions of the shape
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner);
    
    /**
     * Calculates and returns the area
     * 
     * @return area
     */
    default public double getArea() {
        return -1;
    }
    
    /**
     * Calculates and returns the perimeter of the shape
     * 
     * @return perimeter
     */
    default public double getPerimeter() {
        return -1;
    }

    /**
     * Calculates and returns the volume of the shape
     * 
     * @return volume
     */
    default public double getVolume() {
        return -1;
    }
    
    /**
     * Calculates and returns the surface area of the shape
     * 
     * @return surface area
     */
    default public double getSurfaceArea() {
        return -1;
    }
    
    /**
     * Calculates and returns the apothem of the shape
     * 
     * @return apothem
     */
    default public double getApothem() {
        return -1;
    }

    /**
     * Prints the calculations of the shape to present to the user
     */
    default public void printCalculations() {
        if (getArea() != -1) {
            System.out.println("<> Area: " + getArea());
        }
        if (getPerimeter() != -1) {
            System.out.println("<> Perimeter: " + getPerimeter());
        }
        if (getVolume() != -1) {
            System.out.println("<> Volume: " + getVolume());
        }
        if (getSurfaceArea() != -1) {
            System.out.println("<> Surface Area: " + getSurfaceArea());
        }
        if (getApothem() != -1) {
            System.out.println("<> Apothem: " + getApothem());
        }
    };
}