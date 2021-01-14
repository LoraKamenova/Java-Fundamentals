package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNum = Integer.parseInt(scanner.nextLine());
        long secondNum = Integer.parseInt(scanner.nextLine());
        double result = factorial(firstNum) / factorial(secondNum);

        System.out.printf("%.2f", result);
    }

    private static double factorial(long n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
