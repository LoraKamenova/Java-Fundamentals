package Objects_and_Classes_Exercise.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            articles.add(article);
        }
        switch (scanner.nextLine()) {
            case "title":
                articles.stream()
                        .sorted(Comparator.comparing(Article::getTitle))
                        .forEach(e -> System.out.println(e.toString()));
                break;
            case "content":
                articles.stream()
                        .sorted(Comparator.comparing(Article::getContent))
                        .forEach(e -> System.out.println(e.toString()));
                break;
            case "author":
                articles.stream()
                        .sorted(Comparator.comparing(Article::getAuthor))
                        .forEach(e -> System.out.println(e.toString()));
                break;
        }
    }
}
