package Associative_Arrays_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Collections.reverseOrder())
                .limit(3)
                .forEach(e -> System.out.print(e + " "));
    }
}
