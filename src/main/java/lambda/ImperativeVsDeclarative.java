package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static List<Integer> duplicates = Arrays.asList(1,2,2,3,4,4,4,4,5,6,6,6,6,6,6,6,6,6,7,8,9,9);
    public static void main(String[] args) {
        sumImperative();
        sumDeclarative();
        removeDuplicatesImperative();
        removeDuplicatesDeclarative();
    }

    public static void sumImperative() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("imperative sum : " + sum);
    }

    public static void sumDeclarative() {
        int sum = IntStream.rangeClosed(0, 100).sum();
        System.out.println("declarative sum : " + sum);
    }

    public static void removeDuplicatesImperative(){
        List<Integer> result = new ArrayList<>();
        for (Integer num: duplicates){
            if (!result.contains(num)){
                result.add(num);
            }
        }
        System.out.println("remove duplicates imperative : " + result);
    }

    public static void removeDuplicatesDeclarative(){
        List<Integer> result  =duplicates.stream().distinct().collect(Collectors.toList());
        System.out.println("remove duplicates declarative : " + result);
    }
}
