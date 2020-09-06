package ru.mirea.pr1.mikheev;

public class main {

    public static void Main(String[] args) {
        Dog dog = new Dog ("Jack", "Mastiff",8);
        Ball ball = new Ball ("Red", "Large");
        Book book = new Book ("Lords of the Borsis", 72);

        dog.getInfo();
        System.out.println("\n");
        book.getInfo();
        System.out.println("\n");
        ball.getInfo();
    }

    public static class Dog {

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

    public static class Book {

        private final String name;
        private final int pages;

        public Book(String name, int pages) {
            this.name = name;
            this.pages = pages;
        }

        public void getInfo() { System.out.println("Book name: " + name + "\nAmount of pages: " + pages); }
    }

    public static class Ball {

        private final String colour;
        private final String size;

        public Ball(String colour, String size) {
            this.colour = colour;
            this.size = size;
        }

        void getInfo() {
            System.out.println("Colour of the ball is " + colour + "\nAnd its size is " + size);
        }
    }

}
