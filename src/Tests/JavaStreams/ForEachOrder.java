package Tests.JavaStreams;

import java.util.Arrays;
import java.util.List;

public class ForEachOrder {
    public static void main(String[] args) {
        /*
        forEachOrdered() is another method in the Java Stream API that is similar to forEach(),
        but guarantees that the elements in the stream will be processed in the order they appear
        */
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        System.out.print("Using forEachOrdered(): ");
        words.stream()
                .forEachOrdered(word -> System.out.print(word.charAt(0) + " "));
        System.out.println();
    }
}
