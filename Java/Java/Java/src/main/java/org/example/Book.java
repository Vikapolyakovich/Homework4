package org.example;

import java.util.*;

public class Book {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        List<String> names = Arrays.asList("Алена", "Виктор","Федор", "Геннадий", "Петр", "Василий", "Виктор", "Петр");
        List<String> numbers = Arrays.asList("5454622", "5232500","5111107", "5454689", "5432231", "1234520", "8654233", "5962352");


        for (int i = 0; i < names.size(); i++) {
            if (phonebook.containsKey(names.get(i))) {
                for (String k:names) {
                    if (names.get(i) == k) {
                        String value = String.valueOf(phonebook.get(k) + ", " +numbers.get(i));
                        phonebook.put(k, value);
                        break;
                    }
                }

            } else {
                phonebook.put(names.get(i), numbers.get(i));
            }

        }

        LinkedHashMap<String, String> sorted_book = new LinkedHashMap<>();
        phonebook.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(e -> Integer.parseInt(e))))
                        .filter(e->e.getValue().length()>7)
                        .forEach(e->sorted_book.put(e.getKey(), e.getValue()));


        System.out.println(phonebook);
    }
}
