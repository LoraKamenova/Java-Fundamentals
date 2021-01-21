package Associative_Arrays_Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double grade = entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble();
            entry.getValue().removeAll(entry.getValue());
            entry.getValue().add(grade);
        }
        students.entrySet().stream().filter(e -> e.getValue().get(0) >= 4.50)
                .sorted((e1, e2) -> Double.compare(e2.getValue().get(0), e1.getValue().get(0)))
                .forEach(e -> System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue().get(0))));
    }
}
