package org.example;

import java.util.*;

public class Book {
    public static void main(String[] args) {
        HashMap<String, ArrayList> phonebook = new HashMap<>();
        List<String> names = Arrays.asList("Алена", "Виктор","Федор", "Геннадий", "Петр", "Василий", "Виктор", "Петр");
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,5454622, 8654233, 5111107, 5454689, 5432231, 1234520, 5232500, 5962352);


        //добавление контактов

        for (int i = 0; i < names.size(); i++) {
            ArrayList templist = new ArrayList<>();
            if (phonebook.containsKey(names.get(i))) {
                for (int j = 0; j < names.size(); j++) {
                    if (names.get(j) == names.get(i)){
                        templist.add(numbers.get(j));
                    }
                }
            } else {
                templist.add(numbers.get(i));
            }
            phonebook.put(names.get(i), templist);
        }


        //сортировка контактов
        HashMap<String, ArrayList> sorted_book = new LinkedHashMap<>(phonebook);
        phonebook.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(e -> (int) e.get(0))))
                        .forEach(e->sorted_book.put(e.getKey(), e.getValue()));






        System.out.println(phonebook);
        System.out.println(sorted_book);
    }
}
