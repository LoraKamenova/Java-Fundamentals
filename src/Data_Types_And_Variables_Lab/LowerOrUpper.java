package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);

        if (Character.isLowerCase(x)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
