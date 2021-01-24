package Regular_Expressions_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>[\\d]+|[\\d.\\d]+)!(?<quantity>[\\d]+)");

        List<String> furniture = new ArrayList<>();
        double sum = 0;

        while (!"Purchase".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                furniture.add(matcher.group("name"));
                sum += Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
            }
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", sum);
    }
}
