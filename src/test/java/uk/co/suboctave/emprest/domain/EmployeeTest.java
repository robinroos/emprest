package uk.co.suboctave.emprest.domain;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    @org.junit.Test
    public void getName() {
        Employee sut = new Employee("Robin");
        assertEquals("Robin", sut.getName());
    }

    @org.junit.Test
    public void getDateOfBirth() {
        Employee sut = new Employee("James", LocalDate.of(1969, 8, 2));
        assertEquals(LocalDate.of(1969, 8, 2), sut.getDateOfBirth());

    }
}