package Tests.JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println("My created list is a " + list);
        List<Integer> squares = list.stream().map(number -> number * number).toList();
        System.out.println("After using map " + squares);
        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("JavaScript");
        words.add("Swift");
        System.out.println("My created list for Strings " + words);
        List<String> filteredWords = words.stream().map(String::toUpperCase).toList();
        System.out.println("After using " + filteredWords);
        List<String> words1 = Arrays.asList("hello", "world", "java", "streams");
        List<String> filteredWords1 = words1.stream().map(s -> s.substring(0,1).toUpperCase() + s.substring(1)).toList();
        System.out.println("After Using" + filteredWords1);
    }
}
