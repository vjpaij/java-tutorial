package com.vijaypai.demo11final;

public class Demo1FinalVariable {

    public static void main(String[] args) {

         final int a = 10;

//         below will throw compile error as new value cannot be assigned to final variable.
//         a = 11;
        System.out.println(a);

    }
}
