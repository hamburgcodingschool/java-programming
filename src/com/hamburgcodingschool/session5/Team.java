package com.hamburgcodingschool.session5;

import java.util.List;

public class Team extends Organization {

    private List<Employee> team;

    private Employee teamLead;

    protected Team(String name, List<Employee> team, Employee teamLead) {
        super(name);
        this.team = team;
        this.teamLead = teamLead;
    }

    @Override
    public int headCount() {
        return 1 + team.size();
    }
}
