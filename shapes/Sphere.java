package shapes;

import java.util.Scanner;

public class Sphere implements ShapeIO{

    double radius = 0;
    
    public Sphere() {}

    @Override
    public void getSideLengths(Scanner scanner) {
        System.out.print("What is the radius of the sphere?");
        radius = scanner.nextDouble();
    }
    
    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(radius, 3) * 4) / 3;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
