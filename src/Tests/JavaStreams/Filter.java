package Tests.JavaStreams;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println("My created list is a " + list);
        List<Integer> filteredList = list.stream().filter(num -> num % 2 == 0).toList();
        System.out.println("After using filter method " + filteredList);
        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("JavaScript");
        words.add("Swift");
        System.out.println("My created list for Strings " + words);
        List<String> filteredStrings = words.stream().filter(str->str.contains("J")).toList();
        System.out.println("After using filter method " + filteredStrings);



    }
}
