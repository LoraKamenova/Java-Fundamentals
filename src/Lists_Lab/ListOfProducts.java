package Lists_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        int count = 1;
        Collections.sort(products);

        for (String product : products) {
            String numeration = count + "." + product;
            System.out.println(numeration);
            count++;

        }
    }
}
