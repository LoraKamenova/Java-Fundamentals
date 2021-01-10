package BasicSyntax_ConditionalStatements_Loops_Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = n; i <= m ; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.printf("%nSum: %d", sum);
    }
}
