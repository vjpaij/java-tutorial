package com.vijaypai.demo18exceptions;

public class Demo6TryFinally {
    public static void main(String[] args) {
        //also called try with resources.
        //when an exception is met, it handles and doesnt execute any other statements.
        //if you want certain statements to be executed it is put in finally. Finally is used
        //especially when we need to close the resource i.e. file, database etc
        //catch is not mandatory if finally is there but if you want to handle the exception, catch
        //should be there.

        int i=0;
        int j = 0;

        try{
            j = 20/i;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Run this");
        }
        }
}
