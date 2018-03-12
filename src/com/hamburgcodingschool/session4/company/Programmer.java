package com.hamburgcodingschool.session4.company;

import com.hamburgcodingschool.session3.company.Code;

public class Programmer extends Employee {

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public boolean isResponsibleForTeam() {
        return false;
    }

    public Code writeProgram() {
        return Code.JAVA;
    }
}
