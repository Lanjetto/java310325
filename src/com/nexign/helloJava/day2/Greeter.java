package com.nexign.helloJava.day2;

public class Greeter {

    public String greet(String name) {
//        return "Hello " + name + "welcome to Java world";
        return String.format("Hello $s welcome to Java world", name);
    }

    public void percentOf() throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 100 ; i++) {
//            Thread.sleep(100L);
            System.out.println("Процент выполнения " + i + "%");
            sb.append(i).append("%");
        }
        String string = sb.toString();
        System.out.println(string);
    }


    public boolean isWorkday(Days day) {
        boolean isWorkday;
        switch (day) {
            case SA, SU -> {
                System.out.println("выходной, отдыхай");
                isWorkday =  false;
            }
            default -> {
                System.out.println("работай");
                isWorkday = true;
            }
        }
        return isWorkday;
    }
}
