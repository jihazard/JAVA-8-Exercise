package FilterMapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMap2 {
    public static void main(String[] args) {
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");


        Map<Integer , String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p->p.getKey(),p->p.getValue()));
        System.out.println(collect);
    }
}
