package Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isOverflowing = false;
        int volume = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            if (volume + liters > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                volume += liters;
            }
        }
        System.out.println(volume);
    }
}
