package demo01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo01 {
    public static void main(String[] args) {

        List<String> names = List.of("Brook", "Robin", "Franky", "Nami");
        Stream<String> stream = names.stream();
        List<String> collect = stream.collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
