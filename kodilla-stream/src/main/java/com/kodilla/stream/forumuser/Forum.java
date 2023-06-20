package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> users = new ArrayList<>();

    public Forum() {
        users.add(new ForumUser(
                1,
                "user1",
                'M',
                LocalDate.of(1990, 5, 16), 6));
        users.add(new ForumUser(
                2,
                "user2",
                'M',
                LocalDate.of(1995, 5, 16), 5));
        users.add(new ForumUser(
                3,
                "user3",
                'M',
                LocalDate.of(1997, 5, 16), 4));
        users.add(new ForumUser(
                4,
                "user4",
                'M',
                LocalDate.of(2010, 5, 16), 4));
        users.add(new ForumUser(
                5,
                "user5",
                'F',
                LocalDate.of(2005, 5, 16), 0));
        users.add(new ForumUser(
                6,
                "user6",
                'F',
                LocalDate.of(2002, 5, 16), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(users);
    }
}
