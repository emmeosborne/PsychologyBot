package com.company;

public class Main {

    public static void main(String[] args) {
        Bot firstBot = new Bot("Sydney");


        System.out.println(firstBot.getName());
        System.out.println(firstBot.greet());
        System.out.println(firstBot.randomGreeting());
    }

}


