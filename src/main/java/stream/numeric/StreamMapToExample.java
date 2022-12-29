package stream.numeric;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMapToExample {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 5).mapToObj(num -> Integer.valueOf(num)).collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5).mapToLong(num -> num).sum());
        System.out.println(IntStream.rangeClosed(1, 5).mapToDouble(num -> num).sum());
    }
}
