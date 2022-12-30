package optional;

import common.Database;
import common.Student;

import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalExample {


    public static Optional<String> getStudentName(Student student) {
        Optional<Student> optStudent = Optional.ofNullable(student);
        if (optStudent.isPresent()) {
            return Optional.ofNullable(optStudent.get().getName());
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        if (optionalStudent.isPresent()) {
            System.out.println(optionalStudent.get().getName().length());
        } else {
            System.out.println("Student not found");
        }

        System.out.println(getStudentName(null));
        System.out.println(getStudentName(Database.retrieveList().get(0)));

    }
}
