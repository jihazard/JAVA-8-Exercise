package Streamhasalreadybeenoperateduponorclosed;



import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e","e"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

        //get new Stream
        streamSupplier.get().forEach(x -> System.out.println(x));


        //get another Stream
        long count = streamSupplier.get().filter(x->"e".equals(x)).count();
        System.out.println(count);

    }
}
