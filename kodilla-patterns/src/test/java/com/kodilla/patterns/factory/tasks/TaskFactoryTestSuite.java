package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void test() {
        TaskFactory taskFactory = new TaskFactory();

        Task task1 = taskFactory.makeTask(TaskFactory.SHOPPING);
        Task task2 = taskFactory.makeTask(TaskFactory.PAINTING);
        Task task3 = taskFactory.makeTask(TaskFactory.DRIVING);

        task1.executeTask();

        Assertions.assertEquals("shopping", task1.getTaskName());
        Assertions.assertEquals("painting", task2.getTaskName());
        Assertions.assertEquals("driving", task3.getTaskName());
    }
}
