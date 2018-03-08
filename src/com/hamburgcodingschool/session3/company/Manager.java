package com.hamburgcodingschool.session3.company;

import com.hamburgcodingschool.session2.Employee;

import java.util.List;

public class Manager extends Employee {

    private List<Employee> team;

    public Manager(String firstName, String lastName, List<Employee> team) {
        super(firstName, lastName);
        this.team = team;
    }

    public List<Employee> getTeam() {
        return team;
    }
}
