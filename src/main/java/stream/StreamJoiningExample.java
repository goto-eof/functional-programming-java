package stream;

import common.Database;
import common.Student;

import java.util.stream.Collectors;

public class StreamJoiningExample {
    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream().map(Student::getName).collect(Collectors.joining()));
        System.out.println(Database.retrieveList().stream().map(Student::getName).collect(Collectors.joining(", ")));
        System.out.println(Database.retrieveList().stream().map(Student::getName).collect(Collectors.joining(",", "[", "]")));
    }
}
