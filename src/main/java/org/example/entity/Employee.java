package org.example.entity;

import java.util.Objects;

public class Employee {

    private Long id;
    private String firstname;
    private String lastname;

    public Employee(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    // 🔥 Konsolda düzgün görünmesi için
    @Override
    public String toString() {
        return id + " " + firstname + " " + lastname;
    }

    // 🔥 Duplicate kontrolü için kritik (ID bazlı eşitlik)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}