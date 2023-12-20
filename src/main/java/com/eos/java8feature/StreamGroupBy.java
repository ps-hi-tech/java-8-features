package com.eos.java8feature;

import com.eos.java8feature.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {

    public static void main(String args[]) {

        Map<Long,List<Employee>> sortedEmployee1 = ForEachImpl.getAllEmployee().stream().collect(Collectors.groupingBy(e->e.getSalary()));
        System.out.println(sortedEmployee1);
    }
}
