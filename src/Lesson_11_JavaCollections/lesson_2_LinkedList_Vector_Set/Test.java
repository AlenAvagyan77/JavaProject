package Lesson_11_JavaCollections.lesson_2_LinkedList_Vector_Set;

import Lesson_9_Final_Keyword_Inner_Class.A;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>(Arrays.asList(4, 5, 2, 4, 8, 9, 7, 12, 16, 7, 17, 4, 7));
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));

        }

        System.out.println("-------------------");
        for (Integer x : a) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer x = iterator.next();
            System.out.println(x);
        }


        System.out.println("Remove even elements");
        System.out.println(a);

//        for (int i = a.size() - 1; i >= 0 ; i--) {
//            if (a.get(i) % 2  == 0){
//                a.remove(i);
//            }
//        }
//        System.out.println(a);

        System.out.println("--------------------");
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (x % 2 == 0)
                it.remove();
        }
        System.out.println(a);

        Vector<Integer> z = new Vector<>(6);
        z.add(4);
        z.add(458);
        z.add(58);
        System.out.println(z.size());
        System.out.println(z.capacity());


        TreeSet<Integer> hset = new TreeSet<>();
        hset.add(4);
        hset.add(1);
        hset.add(4);
        hset.add(3);
        hset.add(1);
        hset.add(17);
        System.out.println(hset);


        String[] names = {"Haik", "Aram", "Karen", "Aram", "Karen"};
        HashSet<String> ww = new HashSet<>(Arrays.asList(names));

        System.out.println(ww);

//        TreeSet<Human> tset = new TreeSet<>();
//        tset.add(new Human("", 456));
//        tset.add(new Human("", 456));
//        tset.add(new Human("", 456));
//        System.out.println(tset);

        String p = "Hello from Java Hello 2022 Lesson 2022";
        //Hello from Java 2022 Lesson
        String[] v = p.split(" ");
        LinkedHashSet<String> lhset = new LinkedHashSet<>(Arrays.asList(v));
        System.out.println(lhset);
        for (String x : lhset) {
            System.out.print(x + " ");
        }



    }
}
