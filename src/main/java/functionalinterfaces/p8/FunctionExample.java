package functionalinterfaces.p8;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> functionToUpperCase = name -> name.toUpperCase();
    static Function<String, String> functionDotter = name -> name.concat(".");

    public static void main(String[] args) {
        System.out.println(functionToUpperCase.andThen(functionDotter).apply("hello world"));
        System.out.println(functionToUpperCase.compose(functionDotter).apply("hello world"));
    }
}
