package Text_Processing_Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : input) {
            if (text.contains(word)) {
                text = text.replace(word, returnCountStars(word));
            }
        }

        System.out.println(text);
    }

    private static String returnCountStars(String input) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            text.append("*");
        }

        return text.toString();
    }
}
