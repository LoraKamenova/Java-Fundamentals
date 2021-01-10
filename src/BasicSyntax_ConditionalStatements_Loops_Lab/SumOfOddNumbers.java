package BasicSyntax_ConditionalStatements_Loops_Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        int number = 1;
        int sum = 0;

        while (counter <= n) {
            System.out.println(number);
            sum += number;
            number += 2;
            counter++;
        }
        System.out.println("Sum: " + sum);
    }
}
