package com.hamburgcodingschool.session2;

public class Arrays {

    public static void main(String[] args) {
        int[] employees = new int[5];
        employees[0] = 4;
        employees[1] = 33;
        employees[2] = 18;
        employees[3] = 5;
        employees[4] = 10;

        String[] departments = new String[5];
        departments[0] = "Legal";
        departments[1] = "Tech";
        departments[2] = "D&R";
        departments[3] = "Finance";
        departments[4] = "HR";

        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i] + ": " + employees[i]);
        }
    }
}
