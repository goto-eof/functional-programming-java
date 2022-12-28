package methodreference;

import java.util.function.Predicate;

public class MethodReferenceExample3 {

    static Predicate<String> predicate = s -> s.length() > 1;

    static Predicate<String> predicate2 = MethodReferenceExample3::predicate2;

    public static boolean predicate2(String str) {
        return str.length() > 1;
    }

    public static void main(String[] args) {
        System.out.println(predicate.test("ciao"));
        System.out.println(predicate2.test("ciao"));
    }
}
