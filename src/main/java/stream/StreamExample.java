package stream;

import functionalinterfaces.common.Database;
import functionalinterfaces.common.Student;

import java.sql.SQLOutput;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {


    public static void main(String[] args) {
        System.out.println(Database.retrieveList()
                .stream()
                .peek(student -> System.out.println("1 - " + student))
                .filter(student -> student.getAge() > 13)
                .peek(student -> System.out.println("2 - " + student))
                .filter(student -> student.getRate() > 0.3)
                .peek(student -> System.out.println("3 - " + student))
                .collect(Collectors.toMap(student -> student.getName(), student -> student.getAge())));


        Predicate<Student> filterByAge = student -> student.getAge() > 13;
        Predicate<Student> filterByRating = student -> student.getRate() > 0.3;
        System.out.println(Database.retrieveList()
                .stream()
                .filter(filterByAge)
                .filter(filterByRating)
                .collect(Collectors.toMap(Student::getName, Student::getAge))
        );
    }
}
