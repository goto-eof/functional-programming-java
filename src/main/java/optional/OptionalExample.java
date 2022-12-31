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


    public static String orElse() {
        Student student = null;
        return Optional.ofNullable(student).map(Student::getName).orElse("NOT_FOUND");
    }

    public static String orElseGet() {
        Student student = null;
        return Optional.ofNullable(student).map(Student::getName).orElseGet(() -> "NOT_FOUND");
    }

    public static String orElseThrow() {
        Student student = null;
        return Optional.ofNullable(student).map(Student::getName).orElseThrow(() -> new RuntimeException("NOT_FOUND"));
    }

    public static void ifPresent() {
        Student student = new Student();
        Optional.ofNullable(student).ifPresent(stu -> System.out.println(stu));
    }


    public static void map() {
        Optional<Student> opt = Optional.ofNullable(new Student());
        System.out.println(opt.map(Student::getName));
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

        ifPresent();
        map();
        System.out.println(orElse());
        System.out.println(orElseGet());
        System.out.println(orElseThrow());


    }
}
