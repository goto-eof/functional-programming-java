package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Database {

    public static Supplier<List<Student>> students = Database::retrieveList;

    public static List<Student> retrieveList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mario", "Rossi", 13, 0.5, Arrays.asList("nuoto", "pallacanestro", "spaccio")));
        students.add(new Student("Gigi", "D'Agostino", 14, 0.6, Arrays.asList("calcio", "musica")));
        students.add(new Student("Maria", "Filipova", 15, 0.4, Arrays.asList("scacchi", "danza", "piano", "football")));
        students.add(new Student("Gianni", "Profumo", 13, 0.7, Arrays.asList("damma", "telecinesi", "disegno")));
        students.add(new Student("Babù", "Lazy", 13, 0.7, Arrays.asList("damma", "nuoto", "pallacanestro", "spaccio", "drifter")));
        return students;
    }
}
