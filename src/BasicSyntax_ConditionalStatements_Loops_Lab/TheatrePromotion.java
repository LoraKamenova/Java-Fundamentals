package BasicSyntax_ConditionalStatements_Loops_Lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (typeOfDay.equals("Weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            } else {
                System.out.println("Error!");
            }
        } else if (typeOfDay.equals("Weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            } else {
                System.out.println("Error!");
            }

        } else if (typeOfDay.equals("Holiday")) {
            if ((age >= 0 && age <= 18)) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            } else {
                System.out.println("Error!");
            }
        }
        if (price != 0) {
            System.out.println(price + "$");
        }
    }
}
