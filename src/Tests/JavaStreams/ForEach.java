package Tests.JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        // forEach() is a method in the Java Stream API that is used to process each element of a stream.
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        words.stream().forEach(s -> System.out.print(s +" "));
        System.out.println();
        List<String> words2 = new ArrayList<>();
        words.forEach(s -> words2.add(s.substring(0, 1).toUpperCase() + s.substring(1)));
        System.out.println("After using forEach " + words2);

    }
}
