package Methods_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (validateLength(password) && validateLettersAndDigit(password) && validateNums(password)){
            System.out.println("Password is valid");
        }
        if (!validateLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validateLettersAndDigit(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!validateNums(password)){
            System.out.println("Password must have at least 2 digits");
        }

    }
    private static boolean validateLength(String password){
        if (password.length() >=6 &&password.length() <= 10){
            return true;
        }
        return false;
    }
    private static boolean validateLettersAndDigit(String password){
        Pattern pattern = Pattern.compile("^([A-Za-z\\d]+)$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()){
            return true;
        }
        return false;
    }
    private static boolean validateNums(String password){
        Pattern pattern = Pattern.compile("([\\d]{2})");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()){
            return true;
        }
        return false;
    }
}
