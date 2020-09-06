package ru.mirea.pr1.mikheev;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Jack", "Mastiff", 8);
        Ball ball = new Ball("Red", "Large");
        Book book = new Book("Lords of the Borsis", 72);

        dog.getInfo();
        System.out.println("\n");
        book.getInfo();
        System.out.println("\n");
        ball.getInfo();
    }
}