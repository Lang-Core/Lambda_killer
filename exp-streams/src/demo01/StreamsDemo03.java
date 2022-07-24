package demo01;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo03 {
    public static void main(String[] args) {

        String[] namesArray = {"Brook", "Robin", "Franky", "Nami"};
        Stream<String> stream = Arrays.stream(namesArray);
        long count = stream.count();
        System.out.println(count);
    }
}
