package com.nexign.helloJava.day3;

public class Programmer extends Manager{
    private String language;

    public Programmer(String name, String task, int age, String language) {
        super(name, task, age);
        this.language = language;
    }

    @Override
    public void coding() {
        System.out.println("Делаю " + getTask() + " на " + language);
    }
}
