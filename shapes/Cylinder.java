package shapes;

import java.util.Scanner;

public class Cylinder implements ShapeIO {

    private double radius = 0, height = 0;

    public Cylinder() {}

    @Override
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the radius of the base of your cylinder?");
        radius = scanner.nextDouble();
        System.out.println("And the height?");
        height = scanner.nextDouble();
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }
}