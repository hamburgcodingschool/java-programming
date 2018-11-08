package com.hamburgcodingschool.session4.company;

import com.hamburgcodingschool.session3.Employee;

public class Programmer extends Employee {

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Code writeProgram() {
        return Code.JAVA;
    }
}
