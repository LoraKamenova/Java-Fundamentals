package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = "";

        while (!"End".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Add":
                    int num = Integer.parseInt(command[1]);
                    numbers.add(num);
                    break;
                case "Remove":
                    if (checkIndex(numbers, command[1])) {
                        numbers.remove(Integer.parseInt(command[1]));
                    }
                    break;
                case "Insert":
                    if (checkIndex(numbers, command[2])) {
                        numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(command[2]);
                    if (command[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else {
                        for (int j = 0; j < count; j++) {
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean checkIndex(List<Integer> nums, String index) {
        int i = Integer.parseInt(index);
        if (i >= 0 && i < nums.size()) {
            return true;
        } else {
            System.out.println("Invalid index");
            return false;
        }
    }
}
