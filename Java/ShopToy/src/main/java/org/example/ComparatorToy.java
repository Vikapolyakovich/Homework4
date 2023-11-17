package org.example;

import java.util.Comparator;

public class ComparatorToy implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        return Integer.compare(o2.getFrequency(), o1.getFrequency());
    }
}
