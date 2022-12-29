package stream;

import common.Database;

import java.util.stream.Collectors;

public class StreamCountingExample {
    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream().collect(Collectors.counting()));
    }
}
