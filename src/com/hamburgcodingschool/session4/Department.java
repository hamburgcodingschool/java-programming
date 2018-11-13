package com.hamburgcodingschool.session4;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private Employee manager;

    private List<Employee> team;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;

        team = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getManagerName() {
        return manager.getName();
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void printTeam() {
        for (Employee employee : team) {
            System.out.println("Employee: " + employee.getName());
        }
    }

    public void developSoftware() {
        // TODO: for loop over team (Employees)
        // if (employee instanceof Programmer) {
        //      // TODO: write program
        // }
    }
}
