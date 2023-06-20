package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> map = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getBirthdate().isBefore(LocalDate.parse("2003-01-01")))
                .filter(forumUser -> forumUser.getPosts() >= 1)
//                .forEach(System.out::println);
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        System.out.println(map);
    }
}
