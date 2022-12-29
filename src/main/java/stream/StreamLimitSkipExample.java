package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitSkipExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers.stream().limit(2).collect(Collectors.toList()));
        System.out.println(numbers.stream().skip(2).collect(Collectors.toList()));
    }
}
