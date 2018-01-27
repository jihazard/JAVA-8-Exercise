package HowtosortaMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortbyKeys {
    public static void main(String[] args) {
        Map<String,Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Orignal...");
        System.out.println(unsortMap);
        System.out.println("=========================================");
        //정렬 by key 그리고 return new LinkedHashMap
        Map<String,Integer> result =
                unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldValue,newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(result);

        Map<String,Integer> result2 = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> result2.put(x.getKey(),x.getValue()));

        System.out.println("sorted .....");
        System.out.println(result);
        System.out.println("==========================");
        System.out.println(result2);

    }
}
