package com.vijaypai.demo3basicobject;

class Calculator{

    // a class will have properties and methods.

    //method is also called as function.
    //method will return a value. so datatype of returned value has to be mentioned.
    //if nothing is returned we need to mention as void.

    public int sum(int a, int b)
    {
        return a + b;
    }

    //the below is called Method Overloading
    public int sum(int a, int b, int c)
    {
        return a + b + c;
    }


}

public class Demo1basicObject {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

//        the below can be put into a class as a behaviour
//        int result = num1 + num2;
//        System.out.println("sum " + result);

//        when you want an object, first thing is to define a class for the same
//          calc here is called reference variable
        Calculator calc = new Calculator();

        int result = calc.sum(num1, num2);
        System.out.println(result);
    }
}
