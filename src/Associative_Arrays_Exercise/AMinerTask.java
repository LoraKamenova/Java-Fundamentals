package Associative_Arrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = scanner.nextLine())) {
            String input2 = scanner.nextLine();

            items.putIfAbsent(input, 0);
            items.put(input, items.get(input) + Integer.parseInt(input2));
        }
        items.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
