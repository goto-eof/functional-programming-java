package stream;

import common.Database;
import common.Student;

import java.util.stream.Collectors;

public class StreamMappingExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream().collect(Collectors.mapping(Student::getName, Collectors.toSet())));
    }
}
