package Methods_Lab;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        switch (command) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                break;
        }
    }

    private static void add(double a, double b) {
        System.out.printf("%.0f", a + b);
    }

    private static void multiply(double a, double b) {
        System.out.printf("%.0f", a * b);
    }

    private static void subtract(double a, double b) {
        System.out.printf("%.0f", a - b);
    }

    private static void divide(double a, double b) {
        System.out.printf("%.0f", a / b);
    }
}
