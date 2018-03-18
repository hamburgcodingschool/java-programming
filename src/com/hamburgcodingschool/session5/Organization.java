package com.hamburgcodingschool.session5;

public abstract class Organization {

    private String name;

    protected Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int headCount();
}
