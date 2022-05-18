package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "students")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @Email
    @Max(45)
    private String email;

    @Column
    @Max(45)
    private String firstName;

    @Column
    @Max(45)
    private String lastName;

    @Column
    private Date dateOfBirth;

    @Column
    @Max(15)
    private String phone;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<StudentParent> studentParent;

    public Student(Long id, String email, String firstName, String lastName, Date dateOfBirth, String phone, List<StudentParent> studentParent) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.studentParent = studentParent;
    }

    public Student() {
    	super();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setStudentParent(List<StudentParent> studentParent) {
        this.studentParent = studentParent;
    }

    public List<StudentParent> getStudentParent() {
        return studentParent;
    }
}
