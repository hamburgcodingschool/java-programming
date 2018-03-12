package com.hamburgcodingschool.session4.pets;

public abstract class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void pet();
}
