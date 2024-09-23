package com.vijaypai.demo18exceptions;

public class Demo3Throw {
    public static void main(String[] args) {
        int i = 34;
        int r;

        try
        {
            r = 18 / i;
            System.out.println(r);

            //where you want to explicitly want to throw an error, we use throw. Customised error
            //message can be passed
            if (r==0){
                throw new ArithmeticException("result cant be zero");
            }

        }
        catch (ArithmeticException e1)
        {
            r = 18/1;
            System.out.println(e1);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(i);

    }
}
