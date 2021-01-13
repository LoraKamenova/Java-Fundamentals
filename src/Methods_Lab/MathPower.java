package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pow = Double.parseDouble(scanner.nextLine());
        double number = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(power(pow, number)));
    }

    private static double power(double power, double number) {
        return Math.pow(power, number);
    }
}
