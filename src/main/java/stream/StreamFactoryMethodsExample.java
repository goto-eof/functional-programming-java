package stream;

import common.Database;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Random;

public class StreamFactoryMethodsExample {

    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList()));
        System.out.println(Stream.iterate(1, x -> x * 2).limit(10).collect(Collectors.toList()));
        System.out.println(Stream.generate(new Random()::nextInt).limit(10).collect(Collectors.toList()));
    }
}
