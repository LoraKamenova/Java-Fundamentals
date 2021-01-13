package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(generateNewText(text,count));
    }

    static String generateNewText (String text, int count){

        String newText = "";

        for (int i = 0; i < count; i++) {
            newText +=text;
        }
        return newText;
    }
}
