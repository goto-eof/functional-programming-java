package stream;

import common.Database;
import common.Student;

public class StreamReduceExample2 {

    public static void main(String[] args) {
        // number of laptops
        System.out.println(Database.retrieveList().stream()
                .map(Student::getLaptop)
                .reduce(0 , (a,b) -> a + b)
        );
    }
}
