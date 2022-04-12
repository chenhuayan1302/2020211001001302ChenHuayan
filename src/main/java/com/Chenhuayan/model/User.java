package com.Chenhuayan.model;

import java.util.Date;
public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private Date Birthdays;

    public User() {
    }

    public User(int id, String username, String password, String email, String gender, Date Birthdays) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.Birthdays = Birthdays;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdays() {
        return Birthdays;
    }
    public void setBirthdays(Date Birthdays) {
        this.Birthdays = Birthdays;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birth=" + Birthdays +
                '}';
    }
}
