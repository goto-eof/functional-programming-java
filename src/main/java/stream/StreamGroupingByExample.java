package stream;

import common.Database;
import common.Student;

import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.groupingBy(Student::getAge))
        );
        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.groupingBy(student -> student.getAge() > 13 ? "malaledka" : "super malaledka"))
        );
    }
}
