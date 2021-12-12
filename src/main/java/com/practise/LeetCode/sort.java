package com.practise.LeetCode;

import java.util.*;

public class sort {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(0);

        Collections.sort(a,Collections.reverseOrder());
        //System.out.println(a);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Shankar","Annigeri",38));
        employeeList.add(new Employee("Nagaratna","Annigeri",32));
        employeeList.add(new Employee("Pranavi","Annigeri",8));
        employeeList.add(new Employee("Dhruv","Annigeri",4));

       // System.out.println(Arrays.toString(new List[]{employeeList}));

        Employee[] employeeList2 = new Employee[]{
                new Employee("Shankar","Annigeri",38),
                new Employee("Nagaratna","Annigeri",32),
                new Employee("Pranavi","Annigeri",8),
                new Employee("Dhruv","Annigeri",3),
                new Employee("Dhruv","Annigeri",4)
        };


      Arrays.sort(employeeList2);
        System.out.println(Arrays.toString(employeeList2));






    }
}
