package ru.mirea.pr1.mikheev;

public class Book {

    private final String name;
    private final int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public void getInfo() { System.out.println("Book name: " + name + "\nAmount of pages: " + pages); }
}