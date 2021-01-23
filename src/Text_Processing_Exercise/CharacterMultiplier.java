package Text_Processing_Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");

        String firstWord = data[0];
        String secondWord = data[1];

        int sum = 0;
        int index = 0;
        String longWord = "";

        if (firstWord.length() > secondWord.length()) {
            longWord = firstWord;
        } else {
            longWord = secondWord;
        }

        for (int i = 0; i < Math.min(firstWord.length(), secondWord.length()); i++) {
            int firstWordNum = firstWord.charAt(i);
            int secondWordNum = secondWord.charAt(i);

            sum += firstWordNum * secondWordNum;
            index++;
        }

        for (int i = index; i < longWord.length(); i++) {
            sum += longWord.charAt(i);
        }
        System.out.println(sum);
    }
}
