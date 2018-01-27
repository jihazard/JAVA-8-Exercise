package Streamhasalreadybeenoperateduponorclosed;


import java.util.Arrays;
import java.util.stream.Stream;

public class StreamIsClosed {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        Stream<String> stream = Arrays.stream(array);

        stream.forEach(x->System.out.println(x));

        long count = stream.filter(x->"b".equals(x)).count();
        System.out.println(count);
    }
}
