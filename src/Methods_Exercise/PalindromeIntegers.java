package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        while (!num.equals("END")) {
            checkPalindrome(num);
            num = scanner.nextLine();
        }
    }

    public static void checkPalindrome(String num) {
        StringBuilder reverse = new StringBuilder(num).reverse();
        if (num.equals(reverse.toString())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
