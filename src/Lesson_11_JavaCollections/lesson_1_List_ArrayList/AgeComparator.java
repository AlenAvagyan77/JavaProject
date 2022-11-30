package Lesson_11_JavaCollections.lesson_1_List_ArrayList;

import java.util.Comparator;

public class AgeComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getAge() - o2.getAge();
    }
}


