package com.vijaypai.demo18exceptions;

//Ducking exceptions is passing the handling of exceptions in the calling class. This is done by giving
//throws.
class Z {
    public int div(int i, int j) throws ArithmeticException
    {
        return i/j;
    }
}

public class Demo5DuckingExceptionsThrows {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        Z obj = new Z();
        try {
            obj.div(a, b);
        }
        catch (ArithmeticException e1)
        {
            System.out.println("Divide by zero ");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong " + e);
        }

    }
}
