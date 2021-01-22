package Text_Processing_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<letters>[A-Za-z]*)(?<nums>[0-9]*)(?<other>[^A-Za-z0-9]*)");
        Matcher matcher = pattern.matcher(input);

        StringBuilder nums = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        while (matcher.find()) {

            nums.append(matcher.group("nums"));
            letters.append(matcher.group("letters"));
            other.append(matcher.group("other"));

        }

        System.out.println(nums);
        System.out.println(letters);
        System.out.println(other);
    }
}
