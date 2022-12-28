package methodreference;

import common.Database;
import common.Student;

import java.util.function.Consumer;

public class MEthodReferenceExample2 {
    // lambda expression
    static Consumer<Student> consumerStudent = student -> System.out.println(student);
    // method reference
    static Consumer<Student> consumerStudent2 = System.out::println;

    static Consumer<Student> consumerStudent3 = Student::printToString;

    public static void main(String[] args) {
        consumerStudent2.accept(Database.retrieveList().get(0));
        consumerStudent.accept(Database.retrieveList().get(0));
        consumerStudent3.accept(Database.retrieveList().get(0));
    }
}
