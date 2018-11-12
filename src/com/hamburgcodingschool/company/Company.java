package com.hamburgcodingschool.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final List<Department> departments = new ArrayList<>();

    private final String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void printDepartments() {
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
        }
    }
}
