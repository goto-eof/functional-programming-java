package stream;

import common.Database;

public class StreamReduceMaxValueExample {
    public static void main(String[] args) {
        //max number of laptops
        System.out.println(Database.retrieveList().stream()
                .map(student -> student.getLaptop())
                .reduce((a,b) -> a>b ? a : b).get()
        );
    }
}
