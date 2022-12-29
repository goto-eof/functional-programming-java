package stream;

import common.Database;
import common.Student;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.groupingBy(Student::getAge))
        );
        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.groupingBy(student -> student.getAge() > 13 ? "malaledka" : "super malaledka"))
        );

        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.summingInt(Student::getLaptop)))
        );


        System.out.println(String.valueOf(Database.retrieveList().stream()
                .collect(Collectors.groupingBy(Student::getAge, HashMap::new, Collectors.toSet())))
        );


        System.out.println(Database.retrieveList().stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getLaptop)), Optional::get)))
        );
    }
}
