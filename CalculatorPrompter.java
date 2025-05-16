import java.util.Scanner;

import shapes.*;

/**
 * Filename: CalculatorPrompter.java
 * 
 * @author Tina Hague
 * @author Alexander Hamilton
 * 
 * Last Updated: 17 Oct 2024
 */
public class CalculatorPrompter {

    Scanner scanner = new Scanner(System.in);

    public CalculatorPrompter() {
        welcomePrint();
        promptForShape();
    }

    private void promptForShape() {
        String shapeString = scanner.nextLine();

        ShapeIO shapeObject = null;

        switch (shapeString) {
            case "1":
            case "polygon":
                shapeObject = new Polygon();
                break;
            case "2":
            case "circle":
                shapeObject = new Circle();
                break;
            case "4":
            case "cone":
                shapeObject = new Cone();
                break;
            case "5":
            case "cylinder":
                shapeObject = new Cylinder();
                break;
            case "3":
            case "pyramid":
                shapeObject = new RectangularPyramid();
                break;
            case "6":
            case "ellipse":
                shapeObject = new Ellipse();
                break;
            case "7":
            case "sphere":
                shapeObject = new Sphere();
                break;
        }

        shapeObject.getSideLengths(scanner);

        shapeObject.printCalculations();
        restart();
    }

    /**
     * Asks the user if they would like to restart the calculator after 
     * completing a calculation
     */
    public void restart() {
        System.out.println("DO YOU WISH TO RESTART?");
        System.out.println("-> yes");
        System.out.println("-> no");
        // clear out the scanner buffer
        scanner.nextLine();
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("-------------CALCULATOR RESTART-------------");
            addDelay(300);
            System.out.println("Hello again!! Welcome back to the shape calculator :D");
            welcomePrint();
            promptForShape();
        }
        else {
            scanner.close();
            System.out.println("Thank you for using the shape calculator! Have a great day!");
        }
    }

    /**
     * Prints all available options of the calculator
     */
    public void welcomePrint() {
        addDelay();
        System.out.println("What shape would you like to analyze?");
        addDelay(300);
        System.out.println("We currently offer:");
        addDelay();
        System.out.println("1 -> polygon (regular)");
        addDelay();
        System.out.println("2 -> circle");
        addDelay();
        System.out.println("3 -> pyramid (rectangular)");
        addDelay();
        System.out.println("4 -> cone");
        addDelay();
        System.out.println("5 -> cylinder");
        addDelay();
        System.out.println("6 -> ellipse");
        addDelay();
        System.out.println("7 -> sphere");
        addDelay();
    }

    /**
     * Adds a delay of 600 milliseconds
     */
    private void addDelay() {
        addDelay(600);
    }

    /**
     * Adds a delay for a the given duration of milliseconds
     * 
     * @param duration
     */
    private void addDelay(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}