package Objects_and_Classes_Exercise.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            students.add(student);
        }
        students.stream()
                .sorted((e1, e2) -> Double.compare(e2.getGrade(), e1.getGrade()))
                .forEach(e -> System.out.println(e.toString()));
    }
}
