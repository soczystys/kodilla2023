package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String username;
    private char gender;
    private LocalDate birthdate;
    private int posts;

    public ForumUser(int id, String username, char gender, LocalDate birthdate, int posts) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthdate = birthdate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", posts=" + posts +
                '}';
    }
}
