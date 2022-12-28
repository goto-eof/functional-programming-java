package functionalinterfaces.p9;

import common.Database;
import common.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {

    static Predicate<Student> predicateAge = student -> student.getAge() > 13;

    static Function<List<Student>, Map<String, Integer>> studentsListToMapNameAge = students -> {
        Map<String, Integer> map = new HashMap<>();

        students.forEach(student -> {
            if (predicateAge.test(student)) {
                map.put(student.getName(), student.getAge());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println(studentsListToMapNameAge.apply(Database.retrieveList()));
    }
}
