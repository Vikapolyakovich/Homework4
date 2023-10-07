package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable{
    private List<StudyGroup> group = new ArrayList<>();
    private String name;

    public Stream(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public void addgroup(StudyGroup studyGroup) {
        group.add(studyGroup);
    }

    public int getsizestream() {
        return group.size();
    }
}
