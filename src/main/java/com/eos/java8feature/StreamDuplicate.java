package com.eos.java8feature;

import com.eos.java8feature.model.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDuplicate {

    public static void main(String args[]) {

        List<String> empName = ForEachImpl.getAllEmployee().stream().map(emp->emp.getName()).collect(Collectors.toList());
        Set<String> uniqueName=new HashSet<>();
        Set<String> duplicateEmpName = empName.stream().filter(name->!uniqueName.add(name)).collect(Collectors.toSet());
        System.out.println(uniqueName);
        System.out.println(duplicateEmpName);
        Map<String,Long> duNameCnt = empName.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(duNameCnt);
    }
}
