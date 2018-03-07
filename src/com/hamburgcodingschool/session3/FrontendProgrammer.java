package com.hamburgcodingschool.session3;

public class FrontendProgrammer extends Programmer {
    public FrontendProgrammer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public Code writeProgram() {
        return Code.JAVASCRIPT;
    }
}
