package com.hamburgcodingschool.session5.pets;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void pet() {
        System.out.println("purrrrrrrrrrrrr...");
    }
}
