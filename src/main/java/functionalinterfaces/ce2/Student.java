package functionalinterfaces.ce2;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String lastName;
    private int age;
    private double rate;
    private List<String> activities = new ArrayList<>();


    public Student(String name, String lastName, int age, double rate, List<String> activities) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.rate = rate;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", activities=" + activities +
                '}';
    }
}
