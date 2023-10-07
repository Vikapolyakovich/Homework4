package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudyGroup firstgroup = new StudyGroup("FirstGroup");
        StudyGroup secondgroup = new StudyGroup("SecondGroup");
        StudyGroup thirdgroup = new StudyGroup("ThirdGroup");

        Student first = new Student("Vasya", "Pupkin", 20);
        Student second = new Student("Ivan", "Ivanov", 18);
        Student third = new Student("Alla", "Sidorov", 31);
        Student forth = new Student("Zina", "Alexandrova", 19);
        Student fiveth = new Student("Vika", "Slizh", 21);
        Student sixth = new Student("Yana", "Mironova", 29);

        firstgroup.addstudent(first);
        firstgroup.addstudent(third);
        firstgroup.addstudent(fiveth);
        secondgroup.addstudent(second);
        secondgroup.addstudent(sixth);
        thirdgroup.addstudent(forth);


        Stream stream1 = new Stream("FirstStream");
        Stream stream2 = new Stream("SecondStream");

        stream1.addgroup(firstgroup);
        stream1.addgroup(secondgroup);
        stream2.addgroup(thirdgroup);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        StreamService sortedstream = new StreamService();
        sortedstream.sortStreams(streams);

        for (Stream el: streams ) {
            System.out.println(el.getName() + " Кол-во групп в потоке: " + el.getsizestream());
        }

    }

}