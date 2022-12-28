package methodreference;

import functionalinterfaces.common.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> supplierStudent = Student::new;
    static Function<String, Student> functionStudent = Student::new;

    public static void main(String[] args) {
        System.out.println(supplierStudent.get());
        System.out.println(functionStudent.apply("Mario"));
    }
}
