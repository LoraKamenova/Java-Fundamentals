package BasicSyntax_ConditionalStatements_Loops_Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String password = new StringBuffer(username).reverse().toString();

        int counter = 0;

        while (true) {
            String input = scanner.nextLine();
            counter++;
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                if (counter < 4) {
                    System.out.println("Incorrect password. Try again.");
                } else {
                    System.out.printf("User %s blocked!", username);
                    break;
                }
            }
        }
    }
}
