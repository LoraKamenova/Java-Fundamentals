package BasicSyntax_ConditionalStatements_Loops_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String typeOfGroup = scanner.nextLine();
        String typeOfDay = scanner.nextLine();

        double regularPrice = 0;
        double finalPrice = 0;

        if (typeOfDay.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                regularPrice = 8.45;
                if (n >= 30) {
                    finalPrice = (n * regularPrice) * 0.85;
                } else {
                    finalPrice = n * regularPrice;
                }
            } else if (typeOfGroup.equals("Business")) {
                regularPrice = 10.90;
                if (n >= 100) {
                    finalPrice = (n - 10) * regularPrice;
                } else {
                    finalPrice = n * regularPrice;
                }
            } else if (typeOfGroup.equals("Regular")) {
                regularPrice = 15;
                if (n >= 10 && n <= 20) {
                    finalPrice = (n * regularPrice) * 0.95;
                } else {
                    finalPrice = n * regularPrice;
                }
            }
        } else if (typeOfDay.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                regularPrice = 9.80;
                if (n >= 30) {
                    finalPrice = (n * regularPrice) * 0.85;
                } else {
                    finalPrice = n * regularPrice;
                }
            } else if (typeOfGroup.equals("Business")) {
                regularPrice = 15.60;
                if (n >= 100) {
                    finalPrice = (n - 10) * regularPrice;
                } else {
                    finalPrice = n * regularPrice;
                }
            } else if (typeOfGroup.equals("Regular")) {
                regularPrice = 20;
                if (n >= 10 && n <= 20) {
                    finalPrice = (n *  regularPrice) * 0.95;
                } else {
                    finalPrice = n * regularPrice;
                }
            }
        } else if (typeOfDay.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                regularPrice = 10.46;
                if (n >= 30) {
                    finalPrice = (n * regularPrice) * 0.85;
                } else {
                    finalPrice = n * regularPrice;
                }
            } else if (typeOfGroup.equals("Business")) {
                regularPrice = 16;
                if (n >= 100) {
                    finalPrice = (n - 10) * regularPrice;
                } else {
                    finalPrice = n * regularPrice;
                }
            } else if (typeOfGroup.equals("Regular")) {
                regularPrice = 22.50;
                if (n >= 10 && n <= 20) {
                    finalPrice = (n *  regularPrice) * 0.95;
                } else {
                    finalPrice = n * regularPrice;
                }
            }
        }
        System.out.printf("Total price: %.2f", finalPrice);
    }
}
