package com.hamburgcodingschool.company;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private final List<Employee> team = new ArrayList<>();

    private final String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void printEmployees() {
        for (Employee employee : team) {
            System.out.println("Employee: " + employee.getName());
        }
    }
}
