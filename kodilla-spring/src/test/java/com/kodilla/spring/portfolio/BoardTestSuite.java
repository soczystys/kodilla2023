package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    void testTaskAdd() {
        board.toDoList.tasks.add("todo");
        board.inProgressList.tasks.add("in progress");
        board.doneList.tasks.add("done");

        System.out.println(board.toDoList.tasks);
        System.out.println(board.inProgressList.tasks);
        System.out.println(board.doneList.tasks);
    }

    @Test
    void testLoadedBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        System.out.println(context.getBeanDefinitionCount());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
