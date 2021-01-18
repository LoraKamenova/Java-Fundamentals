package Objects_and_Classes_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Collections.shuffle(input);

        input.forEach(System.out::println);

    }
}
