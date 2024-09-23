package com.vijaypai.demo18exceptions;

//Errors are of 3 types
//1.Complile time errors -> spelling mistakes etc
//2.Runtime errors -> errors during running the code. These are called Exceptions and has to be handled
//3.Logical errors -> result not as expected. also called bugs.

public class Demo1SimpleExceptions {
    public static void main(String[] args) {

        //exceptions are handled only for critical statements

        int i = 0;

        int nums[] = new int[3];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;

        //here the below statement is critical as it can give divide by 0 arithmetic exception. such
        //statements has to be put in a block and handle it by try and catch.
        try
        {
            int r = 18 / i;
            System.out.println(r);
        } catch (Exception e1)
        {
            System.out.println("Something is wrong " + e1);
        }
        System.out.println(i);

        try
        {
            System.out.println(nums[4]);
        }
        catch(Exception e2){
            System.out.println("Array Exception " + e2);
        }
    }
}
