package Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String biggestModel = "";
        double biggestVolume = 0;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestModel = model;
            }
        }
        System.out.println(biggestModel);
    }
}
