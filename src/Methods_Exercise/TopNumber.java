package Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (checkDivisibleByEight(i) && checkForOddNum(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkForOddNum(int i) {
        int[] nums = Arrays.stream(String.valueOf(i).split("")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int num : nums) {
            if (num % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDivisibleByEight(int i) {
        int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(e -> Integer.parseInt(e)).sum();
        return sum % 8 == 0;
    }
}
