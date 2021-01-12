package Array_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int leftSum = 0;
        int rightSum = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                index = i;
            }

            leftSum = 0;
            rightSum = 0;
        }

        if (index > -1 ) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
