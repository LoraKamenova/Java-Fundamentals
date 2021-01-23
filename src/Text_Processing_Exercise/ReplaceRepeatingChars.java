package Text_Processing_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Character> result = new ArrayList<>();

        char lastSymbol = input.charAt(0);
        result.add(lastSymbol);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != lastSymbol) {
                result.add(input.charAt(i));
                lastSymbol = input.charAt(i);
            }
        }

        System.out.println(result.toString().replaceAll("[\\[\\],\\s+]", ""));
    }
}
