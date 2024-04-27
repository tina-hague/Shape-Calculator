package shapes;

import java.util.Scanner;

public class Cone implements ShapeIO {
    
    private double radius = 0, height = 0;

    public Cone () {}

    @Override
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the radius of the base of your cone?");

        radius = scanner.nextDouble();

        System.out.println("What is the height of your cone?");

        height = scanner.nextDouble();
    }
    
    @Override
    public double getSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}