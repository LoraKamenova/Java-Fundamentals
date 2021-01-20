package Associative_Arrays_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().toLowerCase()
                .split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Integer> count = new LinkedHashMap<>();

        words.forEach(e -> {
            count.putIfAbsent(e, 0);
            count.put(e, count.get(e) + 1);
        });

        StringBuilder result = new StringBuilder();

        count.forEach((key, value) -> {
            if (value % 2 != 0) {
                result.append(key).append(", ");
            }
        });
        System.out.println(result.deleteCharAt(result.lastIndexOf(", ")));
    }
}
