package stream.numeric;

import java.util.stream.IntStream;

public class StreamSumMinMaxAverageExample {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 30).sum());
        System.out.println(IntStream.rangeClosed(1, 30).max());
        System.out.println(IntStream.rangeClosed(1, 30).min());
        System.out.println(IntStream.rangeClosed(1, 30).average());

    }
}
