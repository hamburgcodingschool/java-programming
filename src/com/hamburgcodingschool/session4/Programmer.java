package com.hamburgcodingschool.session4;

public class Programmer extends Employee {

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void printName() {
        System.out.println(firstName + " " + lastName);
    }

    @Override
    public String getName() {
        return "Programmer: " + firstName + " " + lastName;
    }
}
