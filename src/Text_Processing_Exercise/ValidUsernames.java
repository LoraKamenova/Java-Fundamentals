package Text_Processing_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Pattern check = Pattern.compile("^([A-Za-z\\d\\-_]{3,16})$");

        for (String element : input) {
            Matcher matcher = check.matcher(element);
            if (matcher.find()) {
                System.out.println(element);
            }
        }
    }
}
