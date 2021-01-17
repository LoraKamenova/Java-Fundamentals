package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstHand.isEmpty() && !secondHand.isEmpty()) {

            if (firstHand.get(0) > secondHand.get(0)) {
                firstHand.add(secondHand.get(0));
                firstHand.add(firstHand.get(0));
                firstHand.remove(0);
                secondHand.remove(0);
            } else if ((firstHand.get(0)) < secondHand.get(0)) {
                secondHand.add(firstHand.get(0));
                secondHand.add(secondHand.get(0));
                secondHand.remove(0);
                firstHand.remove(0);
            } else {
                firstHand.remove(0);
                secondHand.remove(0);
            }
        }

        String winner = "";

        if (firstHand.size() > secondHand.size()) {
            winner = "First player wins! Sum: " + firstHand.stream().mapToInt(e -> e).sum();
        } else {
            winner = "Second player wins! Sum: " + secondHand.stream().mapToInt(e -> e).sum();
        }

        System.out.println(winner);
    }
}
