package com.hamburgcodingschool.session4.company;

public class BackendProgrammer extends Programmer {
    public BackendProgrammer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public Code writeProgram() {
        return Code.RUBY;
    }
}
