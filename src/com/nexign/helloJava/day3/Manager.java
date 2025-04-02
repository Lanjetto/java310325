package com.nexign.helloJava.day3;

import com.nexign.helloJava.day1.Box;

import java.awt.*;
import java.util.Objects;

public class Manager {
    private final String name;
    private final String task;
    private final int age;

    public Manager(String name, String task, int age) {
        this.name = name;
        this.task = task;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getTask() {
        return task;
    }


    public int getAge() {
        return age;
    }

    public String printName() {
        System.out.println(name);
        return name + "asdf";
    }

    public void coding() {
        System.out.println("Not professional coding");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return age == manager.age && Objects.equals(name, manager.name) && Objects.equals(task, manager.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, task, age);
    }

    @Override
    public String toString() {
        return "Manager1{" +
                "name='" + name + '\'' +
                ", task='" + task + '\'' +
                ", age=" + age +
                '}';
    }
}
