package stream;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamNonNullExample {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(null, 1, null, 2, null, 3)
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList()));
    }
}
