/**
 * Filename: Main.java
 * 
 * @author Tina Hague
 * @author Alexander Hamilton
 * 
 * Last Updated: 17 Oct 2024
 */
public final class Main {

    public static void main(String[] args) {

        System.out.println("HELLO!! WELCOME TO THE SHAPE CALCULATOR :D\n");
        try {
            Thread.sleep(700);
        } catch (Exception e) {
            e.printStackTrace();
        }

        new CalculatorPrompter();
    }
}