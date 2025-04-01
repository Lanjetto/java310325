package com.nexign.helloJava.day1;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal zarplata;

    public Employee(String name, BigDecimal zarplata) {
        this.name = name;
        this.zarplata = zarplata;
    }

    public void work() {
        System.out.println("Im working");
    }
}
