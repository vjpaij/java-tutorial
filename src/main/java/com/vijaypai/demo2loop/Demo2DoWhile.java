package com.vijaypai.demo2loop;

public class Demo2DoWhile {

    public static void main(String[] args) {


        int n = 1;

        do
        {
            System.out.println("Hi " + n);
            int m = 1;
            do {
                System.out.println("Hello " + m);
                m++;
            }while (m<=3);
            n++;
        } while (n <= 6);

        System.out.println("Bye " + n);
    }
}