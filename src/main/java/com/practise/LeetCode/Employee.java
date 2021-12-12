package com.practise.LeetCode;


public class Employee implements Comparable<Employee> {


    String firstName;


    String lastName;


    Integer age;


    public static <T> int compareAge(T t, T t1) {

        return 0;
    }

    @Override
    public int compareTo(Employee o) {

        Integer compare = this.getFirstName().compareTo(o.getFirstName());
        if (compare == 0) {
            compare = Integer.compare(this.getAge(), o.getAge());
        }

        return compare;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
