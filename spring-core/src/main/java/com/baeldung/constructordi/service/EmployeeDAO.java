package com.baeldung.constructordi.service;

import com.baeldung.beanfactory.Employee;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vijay on 4/3/2017.
 */
public class EmployeeDAO {

    private final List<Employee> employees;

    public EmployeeDAO(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> findAllEmployeesByName(String nameCriteria) {
        return employees.stream().filter(e -> e.getName().contains(nameCriteria))
                .collect(Collectors.toList());
    }
}
