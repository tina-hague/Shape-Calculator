package shapes;

import java.util.Scanner;

public interface ShapeIO {

    public void getSideLengths(Scanner scanner);
    
    default public double getArea() {
        return -1;
    }
    
    default public double getPerimeter() {
        return -1;
    }

    default public double getVolume() {
        return -1;
    }
    
    default public double getSurfaceArea() {
        return -1;
    }
    
    default public double getApothem() {
        return -1;
    }

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