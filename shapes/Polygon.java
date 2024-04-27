package shapes;

import java.util.Scanner;

public class Polygon implements ShapeIO {

    private double sideLength = 0;
    private int sides = 0;

    public Polygon() {}

    @Override
    public void getSideLengths(Scanner scanner) {
        System.out.println("How many sides does your polygon have?");
        sides = scanner.nextInt();
        System.out.println("What is the side length?");
        sideLength = scanner.nextDouble();
    }

    @Override
    public double getApothem() {
        return sideLength / 2 * Math.tan(180/sides);
    }

    @Override
    public double getPerimeter() {
        return sideLength * sides;
    }

    @Override
    public double getArea() {
        return (getApothem() * getPerimeter()) / 2;
    }
}
