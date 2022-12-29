package stream;

import common.Database;
import common.Student;

import java.util.stream.Collectors;

public class StreamSummingInAveragingIntExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream().collect(Collectors.summingInt(Student::getLaptop)));
        System.out.println(Database.retrieveList().stream().collect(Collectors.averagingInt(Student::getLaptop)));
    }
}
