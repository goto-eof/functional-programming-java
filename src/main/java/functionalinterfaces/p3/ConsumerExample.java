package functionalinterfaces.p3;

import functionalinterfaces.common.Database;
import functionalinterfaces.common.Student;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (String s1) -> System.out.println(s1.toUpperCase());
        consumer.accept("Ciao Mondo!");
    }

    public static class ConsumerExample2 {
        static Consumer<Student> consumerNames = (student) -> System.out.println(student.getName());
        static Consumer<Student> consumerName = (student) -> System.out.println(student.getName());
        static Consumer<Student> consumerAge = (student) -> System.out.println(student.getAge());

        public static void main(String[] args) {
            printStudentNames();
            printStudentNamesAndAge();
            printStudentNameAndAgeFiltering();
        }
        private static void printStudentNames() {
            System.out.println("printStudentNames: ");
            Database.retrieveList().forEach(consumerNames);
        }
        private static void printStudentNamesAndAge() {
            System.out.println("printStudentNamesAndAge: ");
            Database.retrieveList().forEach(consumerName.andThen(consumerAge));
        }
        private static void printStudentNameAndAgeFiltering(){
            System.out.println("printStudentNameAndAgeFiltering: ");
            Database.retrieveList().forEach(student -> {
                if (student.getAge()>13){
                    consumerName.andThen(consumerAge).accept(student);
                }
            });
        }

    }
}
