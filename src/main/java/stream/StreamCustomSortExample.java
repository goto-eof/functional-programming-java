package stream;

import common.Database;
import common.Student;

import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamCustomSortExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .map(Student::getName)
                .collect(Collectors.toList())

        );
    }
}
