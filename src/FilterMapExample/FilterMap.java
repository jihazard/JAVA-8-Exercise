package FilterMapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMap {
    public static void main(String[] args) {


        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        String result = "";
        for(Map.Entry<Integer,String> entry : HOSTING.entrySet()){
            if("aws.amazon.com".equals(entry.getValue())){
                result = entry.getValue();
            }
        }

        System.out.println("before java 8 " + result);

        result = HOSTING.entrySet().stream()
                .filter(map -> "aws.amazon.com".equals(map.getValue()))
                .map(map -> map.getValue())
                .collect(Collectors.joining());
        System.out.println("with java 8" + result);

    }
}
