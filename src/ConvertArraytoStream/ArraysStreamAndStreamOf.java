package ConvertArraytoStream;

import javax.swing.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamAndStreamOf {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};

        //Arrays.stream
        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(x -> System.out.println(x));

        System.out.println("=======================");

        //Stream.of
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(x-> System.out.println(x));

    }
}
