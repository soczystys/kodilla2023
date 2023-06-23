package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
//        Path path = Paths.get(file.getPath());
//        Path path = Paths.get("example.txt");
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
//        try (Stream<String> fileLines = Files.lines(Paths.get("namess"))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("inside finally");
        }

        System.out.println(file.getPath());
//        System.out.println(path);
    }
}
