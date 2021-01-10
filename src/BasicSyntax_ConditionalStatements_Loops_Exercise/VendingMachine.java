package BasicSyntax_ConditionalStatements_Loops_Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalSum = 0;

        while (!input.equals("Start")) {
            double sum = Double.parseDouble(input);
            if (sum == 0.1 || sum == 0.2 || sum == 0.5 || sum == 1 || sum == 5) {
                totalSum += sum;
            } else {
                System.out.printf("Cannot accept %.2f%n", sum);
            }
            input = scanner.nextLine();
        }

        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                if (totalSum - 2.0 >= 0) {
                    System.out.println("Purchased " + input);
                    totalSum -= 2.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (totalSum - 0.7 >= 0) {
                    System.out.println("Purchased " + input);
                    totalSum -= 0.7;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (totalSum - 1.5 >= 0) {
                    System.out.println("Purchased " + input);
                    totalSum -= 1.5;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (totalSum - 0.8 >= 0) {
                    System.out.println("Purchased " + input);
                    totalSum -= 0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (totalSum - 1.0 >= 0) {
                    System.out.println("Purchased " + input);
                    totalSum -= 1.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (!input.equals("Start")){
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }
}
