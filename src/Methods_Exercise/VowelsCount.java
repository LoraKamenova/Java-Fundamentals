package Methods_Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().toLowerCase().split("");
        System.out.println(vowelsCount(input));
    }

    private static int vowelsCount(String[] word) {
        String vowels = "aeoui";
        int sum = 0;

        for (String s : word) {
            if (vowels.contains(s)) {
                sum++;
            }
        }
        return sum;
    }
}
