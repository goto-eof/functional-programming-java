package common;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String lastName;
    private int age;
    private double rate;
    private List<String> activities = new ArrayList<>();
    private int laptop;

    public Student(String name, String lastName, int age, double rate, List<String> activities, int laptop) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.rate = rate;
        this.activities = activities;
        this.laptop = laptop;
    }

    public  Student(String name, String lastName, int age, double rate, List<String> activities) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.rate = rate;
        this.activities = activities;
    }

    public Student() {
        super();
    }

    public Student(String s) {
        this.name = s;
    }

    public int getLaptop() {
        return laptop;
    }

    public void setLaptop(int laptop) {
        this.laptop = laptop;
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


    public void printToString(){
        System.out.println(this.toString());
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
