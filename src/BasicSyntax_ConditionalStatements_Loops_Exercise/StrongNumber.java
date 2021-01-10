package BasicSyntax_ConditionalStatements_Loops_Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int initialNumber = number;
        int totalSum = 0;
        int factorial = 1;

        while (number > 0) {
            int digit = number % 10;

            for (int j = 2; j <= digit; j++) {
                factorial *= j;
            }
            totalSum += factorial;
            factorial = 1;
            number = number / 10;
        }

        if (totalSum == initialNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
