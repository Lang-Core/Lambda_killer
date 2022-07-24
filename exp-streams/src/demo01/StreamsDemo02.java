package demo01;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo02 {
    public static void main(String[] args) {

        List<String> names = List.of("Brook", "Robin", "Franky", "Nami");
        Stream<String> stream = names.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
