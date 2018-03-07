package com.hamburgcodingschool.session3;

import com.hamburgcodingschool.session2.Employee;

import java.util.List;

public class TeamLeader extends Employee {

    private List<Employee> team;

    public TeamLeader(String firstName, String lastName, List<Employee> team) {
        super(firstName, lastName);
        this.team = team;
    }

    public List<Employee> getTeam() {
        return team;
    }
}
