package Tests.JavaStreams;

import java.util.Arrays;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8, 9));
        List<Integer> flattenedNumbers = numbers.stream().flatMap(List::stream).filter(num -> num % 2 == 0).toList();
        System.out.println("After using flatMap " + flattenedNumbers);
        List<List<String>> words = Arrays.asList(Arrays.asList("Java", "Swift"), Arrays.asList("JavaScript", "Python"));
        List<String> filteredStrings = words.stream().flatMap(List::stream).filter(str -> str.length() <= 4).toList();
        System.out.println("After using flatMap " + filteredStrings);


    }
}
