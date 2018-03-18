package com.hamburgcodingschool.session5;

import java.util.ArrayList;
import java.util.List;

public class Department extends Organization {

    List<Organization> organizations = new ArrayList<>();

    VicePresident vicePresident;

    public Department(String name, VicePresident vicePresident) {
        super(name);
        this.vicePresident = vicePresident;
    }

    public void addOrganization(Organization organization) {
        organizations.add(organization);
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    @Override
    public int headCount() {
        int headCount = 1;
        for (Organization organization : organizations) {
            headCount += organization.headCount();
        }
        return headCount;
    }
}
