package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input.toLowerCase()) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(getBiggerValue(a, b));
                break;
            case "char":
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                System.out.println(getBiggerValue(first, second));
                break;
            case "string":
                String one = scanner.nextLine();
                String two = scanner.nextLine();
                System.out.println(getBiggerValue(one, two));
                break;
        }
    }

    private static int getBiggerValue(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    private static char getBiggerValue(char a, char b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    private static String getBiggerValue(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}
