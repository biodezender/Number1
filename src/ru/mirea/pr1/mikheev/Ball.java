package ru.mirea.pr1.mikheev;

public class Ball {

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

