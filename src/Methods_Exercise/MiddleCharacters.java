package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleChar(input);
    }
    private static void printMiddleChar(String text){
        if (text.length() % 2 == 0){
            System.out.println(text.substring(text.length() / 2 - 1, text.length() / 2 + 1));
        } else {
            int length = text.length() / 2;

            System.out.println(text.charAt(length));
        }
    }

}
