package BasicSyntax_ConditionalStatements_Loops_Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (true) {
            if (n % 10 == 0) {
                System.out.println("The number is divisible by 10");
                break;
            } else if (n % 7 == 0) {
                System.out.println("The number is divisible by 7");
                break;
            } else if (n % 6 == 0) {
                System.out.println("The number is divisible by 6");
                break;
            } else if (n % 3 == 0) {
                System.out.println("The number is divisible by 3");
                break;
            } else if (n % 2 == 0) {
                System.out.println("The number is divisible by 2");
                break;
            } else {
                System.out.println("Not divisible");
            }
        }
    }
}
