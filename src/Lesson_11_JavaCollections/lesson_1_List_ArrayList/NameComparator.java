package Lesson_11_JavaCollections.lesson_1_List_ArrayList;

import Lesson_11_JavaCollections.lesson_1_List_ArrayList.Human;

import java.util.Comparator;

public class NameComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
