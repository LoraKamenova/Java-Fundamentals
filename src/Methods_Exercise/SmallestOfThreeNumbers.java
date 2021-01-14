package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNum, secondNum, thirdNum);
    }

    private static void printSmallestNumber(int firstNum, int secondNum, int thirdNum){
        int temp = Math.min(firstNum, secondNum);
        int min = Math.min(temp, thirdNum);

        System.out.println(min);
    }
}
