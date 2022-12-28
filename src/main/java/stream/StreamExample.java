package stream;

import functionalinterfaces.common.Database;
import functionalinterfaces.common.Student;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {


    public static void main(String[] args) {
        System.out.println(Database.retrieveList()
                .stream()
                .filter(student -> student.getAge() > 13)
                .filter(student -> student.getRate() > 0.3)
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
