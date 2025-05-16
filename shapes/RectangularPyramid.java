package shapes;

import java.util.Scanner;

/**
 * Filename: RectangularPyramid.java
 * 
 * @author Tina Hague
 * @contributor Alexander Hamilton
 * 
 * Last Updated: 26 Apr 2024
 */
public class RectangularPyramid implements ShapeIO {

    private double length = 0, depth = 0, height = 0;

    /**
     * Creates a new rectangular pyramid
     */
    public RectangularPyramid() {}

    @Override
    /**
     * Asks the user for the dimensions and updates the instance variables
     * 
     * @param scanner
     */
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the length of the base of the pyramid?");
        length = scanner.nextDouble();
        System.out.println("What is the depth of the base of the pyramid?");
        depth = scanner.nextDouble();
        System.out.println("What is the height of the pyramid?");
        height = scanner.nextDouble();
    }

    @Override
    /**
     * Returns the volume of the rectangular pyramid
     * 
     * @return volume
     */
    public double getVolume() {
        return (length * depth * height) / 3;
    }

    @Override
    /**
     * Returns the surface area of the rectangular pyramid
     * 
     * @return surface area
     */
    public double getSurfaceArea() {
        return (length * depth) + (length * Math.sqrt(Math.pow(depth / 2, 2) + Math.pow(height, 2)) +
                (depth * Math.sqrt(Math.pow(length / 2, 2 + Math.pow(height, 2)))));
    }
}
