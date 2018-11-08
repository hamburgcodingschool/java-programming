package com.hamburgcodingschool.session4.company;

public class FrontendProgrammer extends Programmer {
    public FrontendProgrammer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public Code writeProgram() {
        return Code.JAVASCRIPT;
    }
}
