package com.example.cristianbaita.sampleminimalproject.pojo;

/**
 * Created by teo on 24.08.2016.
 */
public class Game {
    private String name;
    private int imageSource;

    public Game(int imageSource, String name) {
        this.name = name;
        this.imageSource = imageSource;
    }

    public String getName() {
        return name;
    }

    public int getImageSource() {
        return imageSource;
    }
}
