package Objects_and_Classes_Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        List<Song> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String[] data = scanner.nextLine().split("_+");
            Song songs = new Song(data[0], data[1], data[2]);
            result.add(songs);
        }

        String typeList = scanner.nextLine();

        for (Song songs : result) {
            if (songs.getTypeList().equals(typeList)) {
                System.out.println(songs.getName());
            }
            if (typeList.equals("all")) {
                System.out.println(songs.getName());
            }
        }
    }
}
