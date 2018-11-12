package com.hamburgcodingschool.session4;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final String name;

    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void printDepartments() {
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
            System.out.println("Manager: " + department.getManagerName());
            department.printTeam();
        }
    }

    public void printName() {
        System.out.println("Company: " + name);
    }
}
