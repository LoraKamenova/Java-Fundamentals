package Objects_and_Classes_Exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            people.add(person);
        }
        people = people.stream().filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        people.forEach(e -> System.out.println(e.toString()));
    }
}
