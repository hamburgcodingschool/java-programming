package com.hamburgcodingschool.session3;

import java.util.ArrayList;
import java.util.List;

public class Pets {

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();

        Cat cat1 = new Cat("Minka");
        Cat cat2 = new Cat("Herr Müller");
        GoldenRetriever goldenRetriever = new GoldenRetriever("Paula", "Ball");
        Dalmatian dalmatian = new Dalmatian("Lucky", "Stick");

        pets.add(cat1);
        pets.add(cat2);
        pets.add(goldenRetriever);
        pets.add(dalmatian);

        for (Pet pet : pets) {
            System.out.println(pet.getName());
            pet.pet();
        }
    }
}
