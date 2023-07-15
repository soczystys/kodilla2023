package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        Library library = new Library("library1");

        Book book1 = new Book("title1", "author1", LocalDate.now());
        Book book2 = new Book("title2", "author2", LocalDate.now());
        Book book3 = new Book("title3", "author3", LocalDate.now());
        Book book4 = new Book("title4", "author4", LocalDate.now());

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library library2 = null;
        try {
            library2 = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library2.getBooks().add(book4);

        System.out.println(library);

        Assertions.assertEquals(3, library.getBooks().size());
        Assertions.assertEquals(4, library2.getBooks().size());

    }
}
