package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();
        String char3 = scanner.nextLine();

        System.out.print(char1 + char2 + char3);
    }
}