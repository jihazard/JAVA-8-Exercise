package StreamReadAFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class TestReadFile {
    public static void main(String[] args) {
        String fileName = "c://Temp/line.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
