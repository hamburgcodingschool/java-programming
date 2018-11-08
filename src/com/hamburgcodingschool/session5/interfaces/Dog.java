package com.hamburgcodingschool.session5.interfaces;

import com.hamburgcodingschool.session5.pets.Pet;

public class Dog extends Pet implements Trainable {

    private Trick trick;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void pet() {

    }

    @Override
    public void train(Trick trick) {

    }

    @Override
    public void doTrick() {

    }
}
