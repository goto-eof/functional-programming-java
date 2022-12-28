package stream.map;

import common.Database;
import common.Student;

import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] args) {
        System.out.println(Database.students.get().stream()
                .map(Student::getActivities)
                .flatMap(listOfString -> listOfString.stream())
                .collect(Collectors.toSet())
        );
    }
}
