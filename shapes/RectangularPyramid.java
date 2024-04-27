package shapes;

import java.util.Scanner;

public class RectangularPyramid implements ShapeIO {

    private double length = 0, depth = 0, height = 0;

    public RectangularPyramid() {}

    @Override
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the length of the base of the pyramid?");
        length = scanner.nextDouble();
        System.out.println("What is the depth of the base of the pyramid?");
        depth = scanner.nextDouble();
        System.out.println("What is the height of the pyramid?");
        height = scanner.nextDouble();
    }

    @Override
    public double getVolume() {
        return (length * depth * height) / 3;
    }

    @Override
    public double getSurfaceArea() {
        return (length * depth) + (length * Math.sqrt(Math.pow(depth / 2, 2) + Math.pow(height, 2)) +
                (depth * Math.sqrt(Math.pow(length / 2, 2 + Math.pow(height, 2)))));
    }
}
