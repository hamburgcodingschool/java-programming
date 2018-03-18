package com.hamburgcodingschool.session5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Chief ceo = new Chief("Frau Soundso");
        Company company = new Company("SuperGiga GmbH", ceo);
        VicePresident vicePresident = new VicePresident("Mr. Schmidt");
        Department department1 = new Department("Department 1", vicePresident);

        List<Employee> team = new ArrayList<>();
        Employee employee1 = new Employee("Teresa");
        Employee employee2 = new Employee("Simon");
        Employee employee3 = new Employee("Helder");
        team.add(employee1);
        team.add(employee2);
        Team team1 = new Team("Team 1", team, employee3);
        department1.addOrganization(team1);
        company.addOrganization(department1);

        List<Employee> teamList = new ArrayList<>();
        Employee employee4 = new Employee("Frank");
        Employee employee5 = new Employee("Olof");
        Employee employee6 = new Employee("Lasse");
        teamList.add(employee4);
        teamList.add(employee5);
        Team team2 = new Team("Team 2", teamList, employee6);
        company.addOrganization(team2);

        System.out.println("Company head count: " + company.headCount());
    }
}
