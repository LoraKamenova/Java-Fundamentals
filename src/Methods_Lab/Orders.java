package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quality = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                coffee(quality);
                break;
            case "water":
                water(quality);
                break;
            case "coke":
                coke(quality);
                break;
            case "snacks":
                snacks(quality);
                break;
        }
    }
    private static void coffee(int quality){
        System.out.printf("%.2f",quality * 1.50);
    }
    private static void water (int quality){
        System.out.printf("%.2f",quality * 1.00);
    }
    private static void coke (int quality){
        System.out.printf("%.2f",quality * 1.40);
    }
    private static void snacks (int quality){
        System.out.printf("%.2f",quality * 2.00);
    }
}
