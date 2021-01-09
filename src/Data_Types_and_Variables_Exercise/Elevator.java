package Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfPeople = Double.parseDouble(scanner.nextLine());
        double elevatorCapacity = Double.parseDouble(scanner.nextLine());

        double iterations = Math.ceil(numberOfPeople / elevatorCapacity);

        System.out.println(Math.round(iterations));
    }
}
