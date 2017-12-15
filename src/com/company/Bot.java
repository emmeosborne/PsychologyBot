package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//class ScannerTest{
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your rollno");
//        int rollno=sc.nextInt();
//        System.out.println("Enter your name");
//        String name=sc.next();
//        System.out.println("Enter your fee");
//        double fee=sc.nextDouble();
//        System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);
//        sc.close();
//    }
//}
//
public class Bot {
    private String name;
    private ArrayList<String> greetings;

    public Bot() {
        this("default Bot");

    }

    public Bot(String name) {
        greetings = new ArrayList<String>();
        greetings.add("Feeling down?");
        greetings.add("Hows it going?");
        greetings.add("ASUH");
        this.name = name;
    }

    public String getName() {
        return "Ms" + name;
    }

    public String greet() {
        return "Hello my name is " + name;
    }

    public String randomGreeting() {
        Random rand = new Random();
        int which = rand.nextInt(greetings.size());
        return greetings.get(which);
    }
}
