package com.hamburgcodingschool.session4;

public class Manager extends Employee {

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getName() {
        return "Manager: " + firstName + " " + lastName;
    }
}
