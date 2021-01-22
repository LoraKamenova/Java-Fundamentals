package Text_Processing_Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!"end".equals(input = scanner.nextLine())) {
            StringBuilder builder = new StringBuilder();
            builder.append(input).reverse();

            System.out.println(String.format("%s = %s", input, builder.toString()));

        }
    }
}
