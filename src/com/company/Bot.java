package com.company;

public class Bot {
    private String name;

    public Bot() {
        name = "default bot";
    }

    public Bot(String name) {
        this.name = name;
    }

    public String getName() {
        return "Ms" + name;
    }
}
