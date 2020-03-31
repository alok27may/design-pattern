package com.learning.ds.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private List<Employee> associate;

    public Employee(final String name, final String department, final double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.associate = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        associate.add(employee);
    }

    public void remove(Employee employee) {
        associate.remove(employee);
    }

    public List<Employee> getAssociate() {
        return associate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
