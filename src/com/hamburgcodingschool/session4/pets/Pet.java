package com.hamburgcodingschool.session4.pets;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pet() {
        System.out.println("Happy!");
    }
}
