package BasicSyntax_ConditionalStatements_Loops_Exercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());

        String definition = "";

        if (age >= 0 && age <= 2 ) {
            definition = "baby";
        } else if (age >= 3 && age <= 13 ) {
            definition = "child";
        } else if (age >= 14 && age <= 19 ) {
            definition = "teenager";
        } else if (age >= 20 && age <= 65 ) {
            definition = "adult";
        } else if (age >= 66 ) {
            definition = "elder";
        }
        System.out.println(definition);
    }
}
