package functionalinterfaces.p10;

import functionalinterfaces.p5.Database;
import functionalinterfaces.p5.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Integer>> biFunctionStudentsToMap = (students, predicate) -> {
        Map<String, Integer> map = new HashMap<>();
        students.forEach(student -> {
            if (predicate.test(student)) {
                map.put(student.getName(), student.getAge());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println(biFunctionStudentsToMap.apply(Database.retrieveList(), student -> student.getAge() > 13));
    }
}
