package functionalinterfaces.p7;

import functionalinterfaces.common.Database;
import functionalinterfaces.common.Student;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

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
