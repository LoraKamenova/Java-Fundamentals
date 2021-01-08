package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int current = 0;
        boolean isSpecial = false;
        for (int i = 1; i <= n; i++) {
            current = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", current);
            } else {
                System.out.printf("%d -> False%n", current);
            }
            sum = 0;
            i = current;
        }
    }
}
