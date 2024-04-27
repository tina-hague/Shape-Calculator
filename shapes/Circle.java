package shapes;

import java.util.Scanner;

public class Circle implements ShapeIO {

    private double radius = 0;

    public Circle() {}

    @Override
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the radius of the circle?");
        radius = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2); 
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
