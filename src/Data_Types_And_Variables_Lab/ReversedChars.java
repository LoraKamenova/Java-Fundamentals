package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();
        String char3 = scanner.nextLine();

        System.out.print(char3 + " " + char2 + " " + char1);
    }
}
