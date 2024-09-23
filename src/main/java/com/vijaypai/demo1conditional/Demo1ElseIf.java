package com.vijaypai.demo1conditional;

public class Demo1ElseIf {

    public static void main(String[] args) {

        int a = 12;
        int b = 2;
        int c = 23;
        boolean result;

        if (a > b && a > c)
            System.out.println(a + " is greater");
        else if (b> a && b > c)
            System.out.println(b + " is greater");
        else
            System.out.println(c + " is greater");

        //ternery operator

        result = a > b ? true : false;
        System.out.println(result);

    }
}
