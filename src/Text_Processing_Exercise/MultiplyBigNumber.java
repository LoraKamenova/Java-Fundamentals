package Text_Processing_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger input = new BigInteger(scanner.nextLine());
        BigInteger input2 = new BigInteger(scanner.nextLine());

        BigInteger result = input.multiply(input2);

        System.out.println(result);
    }
}
