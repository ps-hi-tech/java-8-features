package com.eos.java8feature.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Employee {
    private long id;
    private String name;
    private String city;
    private long salary;
}
