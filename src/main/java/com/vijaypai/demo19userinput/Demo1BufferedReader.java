package com.vijaypai.demo19userinput;

import java.io.*;

public class Demo1BufferedReader {
    public static void main(String[] args){
        //this is a lengthy process to accept value from user. There is an easier process introduced in
        //later java versions which is discussed in next code.
        System.out.println("Enter the number:");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = 0;

        //as readline was giving checked exception, it is mandatory to handle exception. so gave
        //quick fix to surround with try and catch. Readline gives output in String. To convert to int
        //use Integer.parseint

        try {
            num = Integer.parseInt(bf.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(num);
        try {
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
