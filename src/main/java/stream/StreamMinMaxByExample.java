package stream;

import common.Database;
import common.Student;

import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamMinMaxByExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getAge))));
        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getAge))));
    }
}
