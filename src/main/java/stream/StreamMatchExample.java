package stream;

import common.Database;

import javax.xml.crypto.Data;

public class StreamMatchExample {

    public static void main(String[] args) {
        System.out.println(Database.retrieveList().stream()
                .allMatch(student -> student.getAge() >= 13));

        System.out.println(Database.retrieveList().stream()
                .anyMatch(student -> student.getRate() == 0.7)
        );

        System.out.println(Database.retrieveList().stream()
                .noneMatch(student -> student.getRate() == 1)
        );
    }
}
