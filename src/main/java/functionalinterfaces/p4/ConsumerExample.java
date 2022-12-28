package functionalinterfaces.p4;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (String s1) -> System.out.println(s1.toUpperCase());
        consumer.accept("Ciao Mondo!");
    }
}
