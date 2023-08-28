package com.example.project1.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="user")
public class User {
//    id
//    firstname, lastname, date of birth, email, phone
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private Integer phone;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Integer getPhone(){
        return phone;
    }
    public void setPhone(Integer phone){
        this.phone = phone;
    }
}
