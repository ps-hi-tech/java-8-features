package com.eos.java8feature;

/*
* sort employee using based on salary using java streams
 * */

import com.eos.java8feature.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

    public static void main(String args[]){

        List<Employee> sortedEmployee1=ForEachImpl.getAllEmployee().stream().sorted(((a1, a2) -> (int)(a1.getSalary() - a2.getSalary()))).collect(Collectors.toList());
        System.out.println(sortedEmployee1);
        List<Employee> sortedEmployee2=ForEachImpl.getAllEmployee().stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortedEmployee2);
        List<Employee> sortedEmployee3=ForEachImpl.getAllEmployee().stream().sorted(( (a1, a2) ->(int) (a2.getSalary() - a1.getSalary()))).collect(Collectors.toList());
        System.out.println(sortedEmployee3);
        List<Employee> sortedEmployee4=ForEachImpl.getAllEmployee().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortedEmployee4);

    }
}
