package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Biblioteka 1");
        Book przygodyTS = new Book("Przygody TS", "Twain", LocalDate.of(2000,12,21));
        Book wiedzmin = new Book("Wiedzmin", "Sapkowski", LocalDate.of(1990, 10, 12));
        Book grammar = new Book("Grammar", "Kenny", LocalDate.of(1995, 1, 6));
        Book history = new Book("History", "Neil", LocalDate.of(2000, 2, 20));

        library.books.add(przygodyTS);
        library.books.add(wiedzmin);
        library.books.add(grammar);
        library.books.add(history);

        //shallow copy
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Biblioteka 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka 3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        Set<Book> libraryBase = library.getBooks();
        Set<Book> shallowCopyLibrary = shallowClonedLibrary.getBooks();
        Set<Book> deepCopyLibrary = deepClonedLibrary.getBooks();
        libraryBase.remove(wiedzmin);

        //Then
        System.out.println("\nBiblioteka 1:\n" + libraryBase);
        System.out.println("\nBiblioteka 2:\n" + shallowCopyLibrary);
        System.out.println("\nBiblioteka 3:\n" + deepCopyLibrary);
        Assert.assertEquals(3, libraryBase.size());
        Assert.assertEquals(3, shallowCopyLibrary.size());
        Assert.assertEquals(4, deepCopyLibrary.size());
        Assert.assertEquals(libraryBase, shallowCopyLibrary);
        Assert.assertNotEquals(libraryBase, deepCopyLibrary);
    }
}
