package com.nexign.helloJava.day1;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public String name;
    /**
     * @author Alex
     * @param args
     * seahdflhsdfo <b>Hello</>
     *
     */
    public static void main(String[] args) {
        //alt + enter - introduce local variable
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите 1 число");
//        int digit1 = sc.nextInt();
//
//        System.out.println("Введите 2 число");
//        int digit2 = sc.nextInt();
//
//        boolean condition = digit1 > digit2;
//
//        if (condition & isEven(digit1)) {
//            System.out.println("OK");
//        } else {
//            System.out.println("НЕ ОК");
//        }
        long bigDigit1 = 1_000_000_0000L;
        double bigDigit2 = 1003;

        double dividedValues =  bigDigit1 / bigDigit2;
        System.out.println(dividedValues);

        Main main = new Main();
        String[] strings = main.printManyWords("JAVA", 5);
        System.out.println(Arrays.toString(strings));
        float pi = 3.14F;
        Box box = new Box(30., pi);
        Employee employee = new Employee("Alex", BigDecimal.valueOf(100000));

        long i1 = 4_000_000_000L;
        int i2 = (int) i1;
        System.out.println(i2);

        char ch1 = 67;
        char ch2 = 'a';
        System.out.println(ch1 + "" + ch2);

        funnyComputation();

    }

    public static boolean isEven(int digit1) {
        System.out.println("Проверка на четность");
        return digit1 % 2 == 0;
    }

    public String[] printManyWords(String word, int quantity) {
        String[] strings = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println(word);
            strings[i] = word;
        }
        return strings;
    }


    public static void funnyComputation() {
        double a = Long.MAX_VALUE;
        long b = Long.MAX_VALUE;
        int c = 1;
        System.out.println(a+b+c);
        System.out.println(c+b+a);
    }
}


