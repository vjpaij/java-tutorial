package com.vijaypai.demo18exceptions;

class MyOwnException extends Exception{
    //create a constructor
    public MyOwnException(String str) {
        //this is to pass my exception message to be captured while throwing error
        super(str);
    }
}

public class Demo4OwnException {
    public static void main(String[] args) {
        int i = 34;
        int r;

        try
        {
            r = 18 / i;
            System.out.println(r);

            if (r==0){
                throw new MyOwnException("result cant be zero");
            }

        }
        catch (MyOwnException e1)
        {
            r = 18/1;
            System.out.println("Default value " + e1);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(i);

    }
}
