package stream.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequentialVsParallelExample3 {

    public static long sequential(List<Integer> list) {
        long start = System.currentTimeMillis();
        long result = list.stream().reduce(0, (x, y) -> x + y);
        long end = System.currentTimeMillis();
        System.out.println("sequential: " + (end - start));
        return result;
    }

    public static long parallel(List<Integer> list) {
        long start = System.currentTimeMillis();
        long result = list.stream().parallel().reduce(0, (x, y) -> x + y);
        long end = System.currentTimeMillis();
        System.out.println("parallel: " + (end - start));
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 100000000).boxed().collect(Collectors.toList());
        sequential(list);
        parallel(list);
    }
}
