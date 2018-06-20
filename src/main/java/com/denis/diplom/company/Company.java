package com.denis.diplom.company;

public abstract class Company {
    private final String companyName;

    protected Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
