package io.javabrains.springbootsecurity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test8 {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Shankargouda","Annigeri",38));
        employeeList.add(new Employee("Suresh","Patil",40));
        employeeList.add(new Employee("Nagaratna","Annigeri",40));
        employeeList.add(new Employee("Pranavi","Annigeri",40));


        List<Employee>employeeAge40 = employeeList.stream().filter(c->c.age>40).collect(Collectors.toList());
        System.out.println(employeeAge40.toString());

    }
}
