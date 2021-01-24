package Regular_Expressions_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%(?:[^|$%.]*)<(?<product>[^<>]+)>(?:[^|$%.]*)\\|(?<quantity>\\d+)\\|(?:[^|$%.]*?)(?<price>[-+]?\\d+\\.?\\d+)\\$");

        String input = "";
        double total = 0;

        while (!"end of shift".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                double nowSum = Double.parseDouble(matcher.group("quantity")) * Double.parseDouble(matcher.group("price"));
                total += nowSum;
                System.out.println(String.format("%s: %s - %.2f", matcher.group("name"), matcher.group("product"), nowSum));
            }
        }

        System.out.printf("Total income: %.2f", total);
    }
}
