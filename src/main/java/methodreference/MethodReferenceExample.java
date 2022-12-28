package methodreference;

import java.util.function.Function;

public class MethodReferenceExample {

    static Function<String, String> lambdaExample = str -> str.toUpperCase();
    static Function<String, String> methodReferenceExample = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(lambdaExample.apply("ciao mondo"));
        System.out.println(methodReferenceExample.apply("ciao mondo"));
    }
}
