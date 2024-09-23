package com.vijaypai.demo19userinput;

import java.util.Scanner;

public class Demo2Scanner {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        //system.in is to tell value is received from terminal/console.
        //if its file, we need to mention the file.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
