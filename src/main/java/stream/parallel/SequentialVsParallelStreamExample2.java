package stream.parallel;

import common.Database;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SequentialVsParallelStreamExample2 {


    public static Set<String> sequential() {
        long start = System.currentTimeMillis();
        Set<String> result = Database.retrieveList().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        long end = System.currentTimeMillis();
        System.out.println("sequential: " + (end - start));
        return result;
    }

    public static Set<String> parallel() {
        long start = System.currentTimeMillis();
        Set<String> result = Database.retrieveList().stream()
                .parallel()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        long end = System.currentTimeMillis();
        System.out.println("parallel: " + (end - start));
        return result;
    }

    public static void main(String[] args) {
        sequential();
        parallel();
    }
}
