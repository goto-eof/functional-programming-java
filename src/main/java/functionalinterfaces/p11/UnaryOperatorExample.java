package functionalinterfaces.p11;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperatorExample = a -> a.toUpperCase();

    public static void main(String[] args) {
        System.out.println(unaryOperatorExample.apply("ciao mondo!"));
    }
}
