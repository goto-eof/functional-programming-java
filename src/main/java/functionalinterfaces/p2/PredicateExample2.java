package functionalinterfaces.p2;

import functionalinterfaces.ce2.Database;
import functionalinterfaces.ce2.Student;

import javax.xml.crypto.Data;
import java.util.function.Predicate;

public class PredicateExample2 {

    static Predicate<Student> predicateAge = student -> student.getAge() > 13;
    static Predicate<Student> predicateRating = student -> student.getRate() > 0.4;

    public static void main(String[] args) {
        filterByAge();
        filterByRating();
        filterByAgeAndRating();
        filterByAgeAndRatingNegation();
    }


    private static void filterByAge() {
        System.out.println("filterByAge: ");
        Database.retrieveList().forEach(student -> {
            if (predicateAge.test(student)) {
                System.out.println(student);
            }
        });
    }


    private static void filterByRating() {
        System.out.println("filterByRating: ");
        Database.retrieveList().forEach(student -> {
            if (predicateRating.test(student)) {
                System.out.println(student);
            }
        });
    }


    private static void filterByAgeAndRating() {
        System.out.println("filterByAgeAndRating: ");
        Database.retrieveList().forEach(student -> {
            if (predicateAge.and(predicateRating).test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void filterByAgeAndRatingNegation() {
        System.out.println("filterByAgeAndRatingNegation:");
        Database.retrieveList().forEach(student -> {
            if (predicateAge.and(predicateRating).negate().test(student)) {
                System.out.println(student);
            }
        });
    }
}
