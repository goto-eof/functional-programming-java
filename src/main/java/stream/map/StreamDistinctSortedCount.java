package stream.map;

import common.Database;
import common.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctSortedCount {

    public static void main(String[] args) {
        System.out.println(Database.students.get().stream().map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList())
        );
        System.out.println(Database.retrieveList().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count()
        );


        System.out.println(Database.retrieveList().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toMap(activity -> activity, activity -> {
                    return Database.retrieveList().stream()
                                                  .filter(student -> student.getActivities()
                                                                            .contains(activity)).count();
                }))
        );
    }
}
