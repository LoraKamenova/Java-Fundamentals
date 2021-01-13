package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", area(sideA, sideB));

    }

    private static double area(double a, double b) {
        return (a * b);
    }
}

