package Text_Processing_Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        System.out.println("File name: " + data.substring(data.lastIndexOf("\\") + 1, data.indexOf(".")));
        System.out.println("File extension: " + data.substring(data.indexOf(".") + 1));
    }
}
