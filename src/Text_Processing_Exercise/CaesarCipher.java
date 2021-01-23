package Text_Processing_Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) + 3;

            result.append((char) num);
        }

        System.out.println(result);
    }
}
