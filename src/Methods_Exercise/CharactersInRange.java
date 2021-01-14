package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstChar = scanner.nextLine().charAt(0);
        int secondChar = scanner.nextLine().charAt(0);
        printChars(Math.min(firstChar,secondChar),Math.max(firstChar,secondChar));
    }

    private static void printChars(int startIndex, int endIndex) {
        for (int i = startIndex + 1; i < endIndex; i++) {
            System.out.print((char) i + " ");
        }
    }
}
