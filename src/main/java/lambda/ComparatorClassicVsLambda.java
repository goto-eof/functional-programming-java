package lambda;

import java.util.Comparator;

public class ComparatorClassicVsLambda {

    public static void main(String[] args) {
        Comparator<Integer> comparatorClassic = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };
        System.out.println("classic comparator : " + comparatorClassic.compare(1, 2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("lambda comparator : " + comparatorLambda.compare(1, 2));

        Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
        System.out.println("lambda comparator 2 : " + comparatorLambda2.compare(1, 2));

    }
}
