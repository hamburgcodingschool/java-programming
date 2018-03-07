package com.hamburgcodingschool.session3;

public class Dog extends Pet {

    private String favoriteToy;
    protected String furColor;

    public Dog(String name, String favoriteToy) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.furColor = "pied"; // bunt-scheckig
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public String getFurColor() {
        return furColor;
    }

    public void bark() {
        System.out.println("Wouff!");
    }

    @Override
    public void pet() {
        System.out.println("*wag tail*");
    }
}
