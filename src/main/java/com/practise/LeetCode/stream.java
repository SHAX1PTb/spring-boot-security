package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Shankargouda", "Annigeri", 38));
        employeeList.add(new Employee("Suresh", "Patil", 40));
        employeeList.add(new Employee("Nagaratna", "Annigeri", 40));
        employeeList.add(new Employee("Pranavi", "Annigeri", 8));
        employeeList.add(new Employee("Dhruv", "Annigeri", 4));


        List<Integer> employeeAge40 = employeeList.stream().map(a->Integer.valueOf(a.getAge())).filter(c -> c >= 40).collect(Collectors.toList());
        System.out.println(employeeAge40);



    }
}
