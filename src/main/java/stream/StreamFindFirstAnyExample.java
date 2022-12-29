package stream;

import common.Database;

public class StreamFindFirstAnyExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .filter(student -> student.getRate() > 0.5)
                .findFirst()
        );

        System.out.println(Database.retrieveList().stream()
                .filter(student -> student.getRate() > 0.5)
                .findAny()
        );
    }
}
