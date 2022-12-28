package functionalinterfaces.p12;

import common.Database;
import common.Student;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<List<Student>> supplierExample = () -> Database.retrieveList();

    public static void main(String[] args) {
        System.out.println(supplierExample.get());
    }
}
