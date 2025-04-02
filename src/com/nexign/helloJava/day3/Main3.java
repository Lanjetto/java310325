package com.nexign.helloJava.day3;

import java.io.*;

import static com.nexign.helloJava.day3.Person.*;

public class Main3 {
    public static void main(String[] args)  {
//       InputStream bufferedInputStream =
//                new BufferedInputStream(new FileInputStream("one.txt"));

        String w = "world";
        try {
            printToFile(w);
        } catch (FileNotFoundException e) {
            System.out.printf("Error is %s, the word was %s", e.getMessage(), w);
        }

        Calculator calculator = new Calculator();
        double d;
        try {
            d = calculator.divide(2, 0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль дельить нельзя, но тебе можно на");
            d = 0;
        }

//        Manager manager = new Manager();

//        System.out.println(manager.getTask());

//        Person a1 = new Person();
//        Person a2 = new Person();
//        Person a3 = new Person();
//        Person a4 = new Person();

        System.out.println(count);
        Manager manager1 = new Manager("Alex", "some", 123);
        Manager manager2 = new Manager("Alex", "some", 123);
        Manager programmer = new Programmer("Stas", "some", 123, "Java");

        System.out.println(manager1.equals(manager2));
        System.out.println(manager1);
        programmer.coding();

        Person sdfsdf = new Person(23, "sdfsdf");
        sdfsdf.age();


//        System.out.println(asdasd.name)
    }

    private static void printToFile(String word) throws FileNotFoundException {
        try (PrintStream os = new PrintStream(new FileOutputStream("resources/one.txt", true))) {
            throw new FileNotFoundException("Sorry its just a test");
//            os.println(word);

        }
//        System.err.println("Ресурс закрыт");
    }

}
