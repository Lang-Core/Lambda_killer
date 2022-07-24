package demo01;


import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo05 {
    public static void main(String[] args) {

        // 01. find numbers less than or equal 20
        // 02. then change the implementation to find first 5 numbers
        // 03. convert that five numbers to strings

        List<Integer> numbers = List.of(20, 10, 35, 80, 15, 45, 38, 12, 69, 24, 17, 14);
        List<String> list = numbers.stream()
                .filter(number -> number <= 20)
                .limit(5)
                .map(number -> number.toString())
                .toList();
        list.forEach(System.out::println);

    }
}
