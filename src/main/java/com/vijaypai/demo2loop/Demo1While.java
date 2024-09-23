package com.vijaypai.demo2loop;

public class Demo1While {
    public static void main(String[] args) {

        //While is better when reading a data from file or database
        //Do while when you want at least one statement to be performed
        //For is used when you iterate a count or when you have a definite count for looping

        int n = 1;

        while(n<=3)
        {
            System.out.println("Hi "+ n);
            n++;
        }

        System.out.println("Bye " + n);
    }
}
