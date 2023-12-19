package com.eos.java8feature;

import com.eos.java8feature.model.Employee;

import java.util.ArrayList;
import java.util.List;


/*
* Create an Arraylist of employee(id,name,address,salary) objects and retrieve objects from
* ArrayList by using forEach() method of Iterable interface
* */
public class ForEachImpl {

    public static void main(String args[]){


        // Retrieve and display objects using forEach() method
        System.out.println("Employee List:");


        getAllEmployee().forEach(System.out::println);

    }

    public static List<Employee> getAllEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John ", "Main St", 50000));
        employeeList.add(new Employee(2, "Jane ", "Oak St", 60000));
        employeeList.add(new Employee(3, "Bob ", "Elm St", 70000));

        return employeeList;
    }


}
