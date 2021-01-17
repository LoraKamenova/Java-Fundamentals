package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] bomb = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        while (findIndex(numbers, bomb) != -1) {

            int bombNumIndex = findIndex(numbers, bomb);

            int startIndex = validateIndex(bombNumIndex - bomb[1], numbers);
            int endIndex = validateIndex(bombNumIndex + bomb[1], numbers);

            for (int i = startIndex; i <= endIndex; i++) {
                numbers.set(i, 0);
            }
        }

        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }

    private static int findIndex(List<Integer> nums, int[] bomb) {
        int bombNumIndex = -1;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == bomb[0]) {
                bombNumIndex = i;
                break;
            }
        }
        return bombNumIndex;
    }

    private static int validateIndex(int index, List<Integer> nums) {

        if (index < 0) {
            index = 0;
        }
        if (index > nums.size() - 1) {
            index = nums.size() - 1;
        }
        return index;
    }
}
