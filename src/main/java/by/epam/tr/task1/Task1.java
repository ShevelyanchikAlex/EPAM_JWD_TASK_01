package by.epam.tr.task1;

import java.util.Scanner;

public class Task1 {
    private static final String PERIMETER = "Perimeter";
    private static final String SQUARE = "Square";
    private static final String INPUT_A_MSG = "Enter a:";
    private static final String INPUT_B_MSG = "Enter b:";
    private static final String METHODS_PARAMETER_EXCEPTION = "Parameter passing exception occurred";

    public static void main(String[] args) {
        printMessage(INPUT_A_MSG);
        double a = readDouble();
        printMessage(INPUT_B_MSG);
        double b = readDouble();

        outputResults(calculatePerimeter(a, b), calculateSquare(a, b));
    }

    private static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        double number = 0.0;

        while (!isValid) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                isValid = true;
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }

    private static void printMessage(String message) {
        switch (message) {
            case INPUT_A_MSG -> System.out.println(INPUT_A_MSG);
            case INPUT_B_MSG -> System.out.println(INPUT_B_MSG);
            default -> System.out.println(METHODS_PARAMETER_EXCEPTION);
        }
    }

    public static void outputResults(double perimeter, double square) {
        System.out.println(PERIMETER + "=" + perimeter + "\n" + SQUARE + "=" + square);
    }

    public static double calculatePerimeter(double a, double b) {
        return a + b + Math.sqrt(a * a + b * b);
    }

    public static double calculateSquare(double a, double b) {
        return 0.5 * a * b;
    }

}
