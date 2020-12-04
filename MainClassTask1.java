package ru.geekbrains.lesson4jс.task1;
import java.util.*;

public class MainClassTask1 {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "яблоко", "банан", "груша", "апельсин", "яблоко", "киви", "банан", "мандарин", "апельсин", "яблоко",
                "гранат", "апельсин", "апельсин", "лимон", "лимон", "ананас", "ананас", "апельсин", "огурец", "апельсин"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("количество повторов слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
