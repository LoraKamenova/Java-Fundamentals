package Associative_Arrays_Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> users = new TreeMap<>();

        String input = "";

        while (!"End".equals(input = scanner.nextLine())) {
            String[] data = input.split(" -> ");

            users.putIfAbsent(data[0], new ArrayList<>());
            if (!users.get(data[0]).contains(data[1])) {
                users.get(data[0]).add(data[1]);
            }
        }

        users.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(a -> System.out.println("-- " + a));
        });
    }
}
