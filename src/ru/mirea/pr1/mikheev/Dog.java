package ru.mirea.pr1.mikheev;

public class Dog {

    private final String name;
    private final String breed;
    private final int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Dog named: " + name + "\nAge: " + age + "\nBreed: " + breed);
    }
}

