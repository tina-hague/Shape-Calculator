package shapes;

import java.util.Scanner;

public class Ellipse implements ShapeIO {

    private double major = 0, minor = 0;

    public Ellipse() {}

    @Override
    public void getSideLengths(Scanner scanner) {
        System.out.println("What is the major axis length?");
        major = scanner.nextDouble();
        System.out.println("What is the minor axis length?");
        minor = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        return Math.PI * major * minor;
    }

    @Override
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

