package com.hamburgcodingschool.session2;

public class Arrays {

    public static void main(String[] args) {
        int[] employees = new int[5];
        employees[0] = 4;
        employees[1] = 33;
        employees[2] = 18;
        employees[3] = 5;
        employees[4] = 10;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
