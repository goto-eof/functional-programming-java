package stream.numeric;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingUnboxingExample {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 30).boxed().collect(Collectors.toList()));
        System.out.println(Arrays.asList(Integer.valueOf(1), Integer.valueOf(2)).stream()
                .mapToInt(Integer::intValue)
                .sum());
    }

}
