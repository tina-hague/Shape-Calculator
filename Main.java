public final class Main {

    public static void main(String[] args) {

        System.out.println("HELLO!! WELCOME TO THE SHAPE CALCULATOR :D\n");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new CalculatorPrompter();
    }
}
