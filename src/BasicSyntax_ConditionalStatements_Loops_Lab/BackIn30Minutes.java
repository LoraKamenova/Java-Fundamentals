package BasicSyntax_ConditionalStatements_Loops_Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes + 30 > 60) {

            if (hours + 1 > 23) {
                hours = 0;
            } else {
                hours++;
            }

            minutes = minutes + 30 - 60;
        } else {
            minutes += 30;
        }

        if (minutes <= 9) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
