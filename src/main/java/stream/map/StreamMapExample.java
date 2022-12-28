package stream.map;

import functionalinterfaces.common.Database;
import functionalinterfaces.common.Student;

import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {
        System.out.println(Database.students.get().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet())
        );
    }
}
