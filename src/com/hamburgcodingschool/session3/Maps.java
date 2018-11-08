package com.hamburgcodingschool.session3;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> departments = new HashMap<>(5);
        departments.put("Legal", 4);
        departments.put("Tech", 33);
        departments.put("R&D", 12);
        departments.put("Finance", 5);
        departments.put("HR", 10);

        int legalDepartment = departments.get("Legal");
        System.out.println(legalDepartment);

        // TODO: iterate over keySet
        // TODO: iterate over entrySet
    }
}
