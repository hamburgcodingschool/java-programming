package com.hamburgcodingschool.session5;

public class Employee implements Payable {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void pay(int amonut) {
        System.out.println("Payed " + amonut + " to Employee " + name);
    }
}
