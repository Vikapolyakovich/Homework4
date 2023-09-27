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
        System.out.println(phonebook);

        //сортировка контактов
        HashMap<String, ArrayList> sorted_book = new LinkedHashMap<>(phonebook);
        phonebook.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size()))
                .forEach(n -> System.out.printf("Имя: %s \n Телефоны: %s \n",n.getKey(), n.getValue()));







    }
}
