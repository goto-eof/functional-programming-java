package functionalinterfaces.p1;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicateDivisibleBy2 = (number) -> number % 2 == 0;
    static Predicate<Integer> predicateDivisibleBy5 = (number) -> number % 5 == 0;
    public static void main(String[] args) {
        predicateExample();
    }


    private static void predicateExample() {
        System.out.println("Number is divisible by 2: " + (predicateDivisibleBy2.test(5)));
        System.out.println("Number is divisible by 5: " + (predicateDivisibleBy5.test(5)));
        System.out.println("Number is divisible by 2 and by 5: " + (predicateDivisibleBy2.and(predicateDivisibleBy5).test(5)));
        System.out.println("Number is divisible by 2 or by 5: " + (predicateDivisibleBy2.or(predicateDivisibleBy5).test(5)));
    }

}
