package uk.co.suboctave.emprest.domain;

import java.time.LocalDate;

public class Employee {
    protected String name;
    protected LocalDate dateOfBirth;

    public Employee(String name) {
        this.name = name;
        dateOfBirth = LocalDate.now();
    }

    public Employee(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }



    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
