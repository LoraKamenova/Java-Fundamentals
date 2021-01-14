package Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        rowLoop(num);

    }

    private static void rowLoop(int num){
        for (int i = 0; i < num; i++) {
            printMatrix(num);
            System.out.println();
        }
    }

    private static void printMatrix (int printNum){
        for (int i = 0; i < printNum; i++) {
            System.out.print(printNum + " ");
        }
    }
}
