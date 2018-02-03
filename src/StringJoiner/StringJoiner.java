package StringJoiner;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringJoiner {
    public static void main(String[] args) {

        Set<String> strings = new LinkedHashSet<>();
        strings.add("java");
        strings.add("is");
        strings.add("very");
        strings.add("cool");
        String message = String.join("-",strings);


        System.out.println(message);
    }
}
