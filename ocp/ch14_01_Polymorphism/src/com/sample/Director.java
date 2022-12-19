package com.sample;

public class Director extends Manager {

    private double budget;

    public Director(double budget, String deptName, int empId, String name, String ssn, double salary) {
        super(deptName, empId, name, ssn, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
