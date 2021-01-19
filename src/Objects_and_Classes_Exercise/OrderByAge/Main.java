package Objects_and_Classes_Exercise.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        List<Person> persons = new ArrayList<>();

        while (!"End".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            persons.add(person);
        }
        persons.stream()
                .sorted(Comparator.comparingInt(e -> e.age))
                .forEach(e -> System.out.println(e.toString()));
    }
}
