package Methods_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().replace("-", "").split(""))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        System.out.println(sumEvenAndOddDigit(numbers));
    }

    private static int sumEvenAndOddDigit(int[] nums) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        return evenSum * oddSum;
    }
}
