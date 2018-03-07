package com.hamburgcodingschool.session3;

public class AndroidProgrammer extends Programmer {
    public AndroidProgrammer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public Code writeProgram() {
        return Code.JAVA;
    }
}
