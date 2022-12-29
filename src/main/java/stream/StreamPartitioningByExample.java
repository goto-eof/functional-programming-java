package stream;

import common.Database;

import java.util.stream.Collectors;

public class StreamPartitioningByExample {
    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.partitioningBy(student -> student.getLaptop() > 1))
        );

        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.partitioningBy(student -> student.getLaptop() > 1, Collectors.toSet()))
        );
    }
}
