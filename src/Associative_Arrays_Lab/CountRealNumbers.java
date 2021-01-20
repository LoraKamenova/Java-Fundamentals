package Associative_Arrays_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Map<Integer, Integer> countNum = new TreeMap<>();

        numbers.forEach(e -> {
            countNum.putIfAbsent(e, 0);
            countNum.put(e, countNum.get(e) + 1);
        });

        countNum.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
