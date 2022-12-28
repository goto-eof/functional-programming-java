package functionalinterfaces.p6;

import functionalinterfaces.p5.Database;
import functionalinterfaces.p5.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CombiningAllExample {

    static Predicate<Student> predicateAge = student -> student.getAge() > 13;
    static Predicate<Student> predicateRating = student -> student.getRate() > 0.4;

    static BiConsumer<String, List<String>> biconsumerNameActivities = (name, activities) -> System.out.println(name + " : " + activities);

    static Consumer<Student> consumerStudent = student -> {
        if (predicateAge.and(predicateRating).test(student)) {
            biconsumerNameActivities.accept(student.getName(), student.getActivities());
        }
    };

    public static void main(String[] args) {
        Database.retrieveList().forEach(consumerStudent);
    }

}
