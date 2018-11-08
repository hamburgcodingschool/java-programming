package com.hamburgcodingschool.session5.company;

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

    @Override
    public boolean isResponsibleForTeam() {
        return true;
    }
}
