package ConvertStreamtoList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {
        Stream<String> language = Stream.of("java", "python", "node");
        //스트림을 List로 변환
        List<String> result = language.collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}
