package stream.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialVsParallelStreamExample {


    public static long checkPerformance(Supplier<Integer> supplier, int count) {
        long start = System.currentTimeMillis();
        IntStream.range(0, count).forEach(i -> {
            supplier.get();
        });
        long end = System.currentTimeMillis();
        return end - start;
    }


    public static void main(String[] args) {
        System.out.println("sequential: " + checkPerformance(() -> IntStream.rangeClosed(1, 10000000).sum(), 20));
        System.out.println("parallel: " + checkPerformance(() -> IntStream.rangeClosed(1, 10000000).parallel().sum(), 20));
    }
}
