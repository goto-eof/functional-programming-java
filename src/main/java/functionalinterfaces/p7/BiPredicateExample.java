package functionalinterfaces.p7;

import functionalinterfaces.p5.Database;
import functionalinterfaces.p5.Student;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {
    static BiPredicate<Integer, Double> predicateAgeAndRating = (age, rating) -> age > 13 && rating > 0.4;
    static BiPredicate<Integer, Double> predicateNameLastName = (age, rating) ->age == 14 && rating == 0.5;
    static Consumer<Student> consumerStudent = student -> {
        if (predicateAgeAndRating.and(predicateNameLastName).test(student.getAge(), student.getRate())) {
            System.out.println(student);
        }
    };

    public static void main(String[] args) {
        Database.retrieveList().forEach(consumerStudent);
    }
}
