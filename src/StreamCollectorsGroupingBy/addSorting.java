package StreamCollectorsGroupingBy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class addSorting {
    public static void main(String[] args) {
        List<String> items =
                Arrays.asList("apple","apple","banana",
                        "apple","oragne","banana" ,"papaya"
                );

        Map<String,Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),Collectors.counting()
                        )
                );

        Map<String,Long > finalMap = new LinkedHashMap<>();

        result.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue()
                .reversed()).forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));

        System.out.println(result);
    }
}
