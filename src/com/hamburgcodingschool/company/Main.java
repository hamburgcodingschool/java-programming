package com.hamburgcodingschool.company;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("SuperGiga GmbH");

        Department legal = new Department("Legal");
        Employee alice = new Employee("Alice", "Arnold");
        Employee bob = new Employee("Bob", "Bernard");
        Employee chris = new Employee("Chris", "Cunningham");
        legal.addEmployee(alice);
        legal.addEmployee(bob);
        legal.addEmployee(chris);

        Department tech = new Department("Tech");
        Department dAndR = new Department("D&R");
        Department finance = new Department("Finance");
        Department hr = new Department("HR");

        company.addDepartment(legal);
        company.addDepartment(tech);
        company.addDepartment(dAndR);
        company.addDepartment(finance);
        company.addDepartment(hr);

        company.printDepartments();
    }
}
