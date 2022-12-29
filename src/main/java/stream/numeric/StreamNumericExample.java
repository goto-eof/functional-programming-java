package stream.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamNumericExample {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 5).sum());
        System.out.println(IntStream.range(1, 5).sum());
        System.out.println(LongStream.rangeClosed(1, 5).sum());
        System.out.println(LongStream.range(1, 5).sum());
        System.out.println(IntStream.rangeClosed(1, 5).asDoubleStream().sum());
        System.out.println(IntStream.range(1, 5).asDoubleStream().sum());
    }
}
