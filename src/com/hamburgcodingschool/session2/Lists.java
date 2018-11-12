package com.hamburgcodingschool.session2;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Tom");
        employees.add("Gretha");
        employees.add("Ishmael");
        employees.add("Stella");
        employees.add("James");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
