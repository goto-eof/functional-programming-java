package functionalinterfaces.bce1;

import functionalinterfaces.ce2.Database;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<String, Integer> biConsumerFirstNameAge = (name, age) -> {
        System.out.println(name + " : " + age);
    };

    public static void main(String[] args) {
        biConsumentExample();
    }

    private static void biConsumentExample() {
        Database.retrieveList().forEach(student -> {
            biConsumerFirstNameAge.accept(student.getName(), student.getAge());

        });
    }
}
