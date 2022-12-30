package stream.parallel;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,1000).parallel().sum());
    }
}
