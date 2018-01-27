package StreamCollectorsGroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorsGroupingBy {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple" ,"apple" ,"banana" , "orange"
                                          , "apple","banana","papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),Collectors.counting()
                        )
                );
        System.out.println("result "+result);
    }
}
