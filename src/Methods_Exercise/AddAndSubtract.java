package Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractNum(sumTwoNumber(firstNum, secondNum), thirdNum));
    }

    private static int sumTwoNumber(int a, int b) {
        return a + b;
    }

    private static int subtractNum(int a, int b) {
        return a - b;
    }
}
