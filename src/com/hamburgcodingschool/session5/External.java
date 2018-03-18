package com.hamburgcodingschool.session5;

public class External implements Payable {

    private String name;

    public External(String name) {
        this.name = name;
    }

    @Override
    public void pay(int amonut) {
        System.out.println("Pay fee of " + amonut + " to External " + name);
    }
}
