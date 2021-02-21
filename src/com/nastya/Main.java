package com.nastya;

import java.util.*;

public class Main {

    public static void main(String[] args) {

   List<String> fruits = Arrays.asList("Яблоко", "Вишня", "Яблоко", "Виноград", "Яблоко", "Апельсин",
           "Виноград", "Манго", "Банан", "Вишня", "Банан", "Айва", "Лимон", "Лимон");
        System.out.println("\nСписок уникальных слов: ");
        Set<String> unique = new HashSet<>(fruits);
        for ( String o:unique)
            System.out.println (o);
        System.out.println("\nСчетчик:");
    Map<String, Integer> fruitCount = new HashMap <String, Integer>();
        for (String o : fruits) {
            fruitCount.put (o ,fruitCount.getOrDefault(o, 0) + 1);
    }
        System.out.println (fruitCount);

        Book phoneBook = new Book ();
        phoneBook.add("Иванов", "22334461");
        phoneBook.add("Петров", "22334462");
        phoneBook.add("Сидоров", "22334463");
        phoneBook.add("Сидоров", "22334464");
        phoneBook.add("Ковалев", "22334465");
        phoneBook.add("Ковалева", "22334466");
        phoneBook.add("Плахов", "22334467");
        phoneBook.add("Сидорова", "22334468");
        phoneBook.add("Иванов", "22334469");

        System.out.println (phoneBook.get ("Иванов")) ;
        phoneBook.info ();
}
}
