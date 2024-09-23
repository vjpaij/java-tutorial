package com.vijaypai.demo2loop;

public class Demo4ForEach {
    //Also called Enhanced For loop
    //Used for Arrays and arraytypes

    public static void main(String[] args) {
        int num1[] = new int[3];
        num1[0] = 3;
        num1[1] = 5;
        num1[2] = 8;

        //int -> datatype of the data should be mentioned
        //n would be data in the first index and gets automatically incremented by 1 starting from 0.
        //num1 would be array name
        for (int n : num1)
            System.out.println(n);
    }
}
