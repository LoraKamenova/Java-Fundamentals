package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = "";

        while (!"end".equals(command = scanner.nextLine())) {
            String[] commands = command.split(" ");
            int number;

            switch (commands[0]) {
                case "Contains":
                    number = Integer.parseInt(commands[1]);
                    printContains(number, numbers);
                    break;
                case "Print":
                    String prints = commands[0] + " " + commands[1];
                    if (prints.equals("Print even")) {
                        printEvenNums(numbers);
                    } else {
                        PrintOddNums(numbers);
                    }
                    break;
                case "Get":
                    printSum(numbers);
                    break;
                case "Filter":
                    number = Integer.parseInt(commands[2]);
                    printFilterNum(numbers, number, commands[1]);
                    break;
            }
        }
    }

    private static void printContains(int numCheck, List<Integer> num) {
        if (num.contains(numCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printEvenNums(List<Integer> num) {
        for (Integer integer : num) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    private static void PrintOddNums(List<Integer> num) {

        for (Integer integer : num) {
            if (integer % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    private static void printSum(List<Integer> num) {
        int sum = 0;
        for (Integer integer : num) {
            sum += integer;
        }
        System.out.println(sum);
    }

    private static void printFilterNum(List<Integer> num, int number, String command) {
        switch (command) {
            case "<":
                for (Integer integer : num) {
                    if (integer < number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (Integer integer : num) {
                    if (integer > number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (Integer integer : num) {
                    if (integer <= number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (Integer integer : num) {
                    if (integer >= number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case "=":
                for (Integer integer : num) {
                    if (integer == number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
        }
    }
}
