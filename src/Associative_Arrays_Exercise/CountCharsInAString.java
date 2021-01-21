package Associative_Arrays_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Integer> count = new LinkedHashMap<>();

        for (String s : input) {
            String[] data = s.split("");
            for (String datum : data) {
                count.putIfAbsent(datum, 0);
                count.put(datum, count.get(datum) + 1);
            }
        }
        count.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
