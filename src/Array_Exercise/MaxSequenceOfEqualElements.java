package Array_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int maxCount = 0;
        int digit = 0;
        int counter = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                counter++;

                if (counter > maxCount) {
                    maxCount = counter;
                    digit = arr[i];
                }
            } else
                counter = 1;
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }

    }
}
