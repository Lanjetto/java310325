package com.nexign.helloJava.day2;

import com.nexign.helloJava.day1.Box;
import com.nexign.helloJava.day1.Employee;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(args[0]);

//        Employee employee = null;
//        employee.work();
        NewInteger integer = new NewInteger(5);
        System.out.println(integer.i());

        Integer i1 = 5;
        int i2 = i1;
            Integer i = i1 + 5;

        List<Object> integers = new ArrayList<>();
        integers.add(5);
        integers.add('5');
        integers.add("asdasd");

        Integer num1 = 1000;
        Integer num2 = 1000;

        System.out.println(num1.equals(num2));

        BigDecimal b1 = BigDecimal.valueOf(45.2);

        BigDecimal b2 = BigDecimal.valueOf(3.8);

        System.out.println(b1.divide(b2, RoundingMode.UP));
        char o = (char) integers.get(1);

        BigInteger two = BigInteger.TWO;
        BigInteger three = BigInteger.valueOf(3);

        BigInteger divide = three.divide(two);
        BigDecimal divide1 = new BigDecimal(divide);


        int[] array = new int[]{1,2,4};
        int sum = 0;

//        for (int j = 0; j < array.length; j++) {
//            sum+=array[j];
//        }

        for (int i3 : array) {
            sum+=i3;
        }

        System.out.println(sum);

        int[] array2 = Arrays.copyOf(array, array.length *2);
        array2[3] = 5;
        System.out.println(Arrays.toString(array2));
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        Box box1 = new Box(2., 3.F);
        Box box2 = new Box(2., 3.F);

        System.out.println(box1.equals(box2));

        Box[] boxes = {new Box(2., 3.F), new Box(2., 3.F)};
        Box[] boxes1 = {new Box(2., 3.F), new Box(2., 3.F)};

        boolean equals = Arrays.equals(boxes, boxes1);
        System.out.println(equals);



        boxes1[0] = null;

        String s0 = "Hello, goodbye, welcome";

        char c = s0.charAt(0);

        boolean lo = s0.contains("lo");

        String[] split = s0.split(",");
        System.out.println(Arrays.toString(split));
        String join = String.join(",", split);
//        s0.
//        System.out.println(join);

        for (char aByte : s0.toCharArray()) {
            System.out.println(aByte);
        }

        byte[] bytes = s0.getBytes();
        char a = (char) bytes[0];
        System.out.println(a);


        String s1 = "Hello";
        System.out.println(s0 == s1);

        Greeter greeter = new Greeter();
        greeter.greet("Alex");
        greeter.percentOf();


        System.out.println(greeter.isWorkday(Days.SU));


    }


}
