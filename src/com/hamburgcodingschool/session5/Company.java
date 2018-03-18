package com.hamburgcodingschool.session5;

import java.util.ArrayList;
import java.util.List;

public class Company extends Organization {
    private List<Organization> organizations = new ArrayList<>();
    private Chief chiefExecutionOfficer;

    protected Company(String name, Chief chiefExecutionOfficer) {
        super(name);
        this.chiefExecutionOfficer = chiefExecutionOfficer;
    }

    public void addOrganization(Organization organization) {
        organizations.add(organization);
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
