package com.fastrack.Exercise3;

import com.fastrack.Exercise2.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee extends Person {

    public Employee(String name, Integer age, String hairColour) {
        super(name, age, hairColour);
    }
    public String company;
    public Integer salary;

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee(String name, Integer age, String hairColour, String company, Integer salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }


}
