package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = "";

        while (!"end".equals(command = scanner.nextLine())) {

            String[] type = command.split(" ");

            switch (type[0]) {
                case "Add":
                    addNums(type, numbers);
                    break;
                case "Remove":
                    removeNums(type, numbers);
                    break;
                case "RemoveAt":
                    removeAt(type, numbers);
                    break;
                case "Insert":
                    addAtIndex(type, numbers);
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void addNums(String[] command, List<Integer> nums) {
        int num = Integer.parseInt(command[1]);
        nums.add(nums.size(), num);
    }

    private static void removeNums(String[] command, List<Integer> nums) {
        int num = Integer.parseInt(command[1]);
        for (int i = 0; i < nums.size(); i++) {
            if (num == nums.get(i)) {
                nums.remove(i);
                break;
            }
        }
    }

    private static void removeAt(String[] command, List<Integer> nums) {
        int num = Integer.parseInt(command[1]);
        nums.remove(num);
    }

    private static void addAtIndex(String[] command, List<Integer> nums) {
        int firstNum = Integer.parseInt(command[1]);
        int secondNum = Integer.parseInt(command[2]);
        nums.add(secondNum, firstNum);
    }
}
