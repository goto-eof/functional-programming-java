package stream;

import common.Database;

import java.util.Arrays;

public class StreamReduceExample {
    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .reduce((s1, s2) -> s1.getRate() > s2.getRate() ? s1 : s2));
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().reduce(1, (a, b) -> a * b));
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().reduce((a, b) -> a * b));

    }
}
