package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            if (data[2].equals("going!")){
                if (!guests.contains(data[0])){
                    guests.add(data[0]);
                } else {
                    System.out.println(data[0] + " is already in the list!");
                }
            } else {
                if (guests.contains(data[0])){
                    guests.remove(data[0]);
                }else {
                    System.out.println(data[0] + " is not in the list!");
                }
            }
        }
        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i));
        }
    }
}
