package functionalinterfaces.p11;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperatorExample = (a, b) -> a * b;
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(binaryOperatorExample.apply(3, 2));
        System.out.println(BinaryOperator.maxBy((comparator)).apply(3, 2));
        System.out.println(BinaryOperator.minBy((comparator)).apply(3, 2));
    }
}
