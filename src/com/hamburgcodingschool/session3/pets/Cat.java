package com.hamburgcodingschool.session3.pets;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public void scratch() {
        System.out.println("SCRATCH!!!");
    }

    @Override
    public void pet() {
        System.out.println("purrrrrrrrrrrrr....");
    }
}
