package com.vijaypai.demo14innerclass;

class A
{
    public void show()
    {
        System.out.println("In A Class Show");
    }
    class B
    {
        public void config()
        {
            System.out.println("In B Class Config");
        }
    }

    static class C
    {
        public void config()
        {
            System.out.println("In C Class Config");
        }
    }
}

public class Demo1InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        //notice you cant access B class method like below
        //obj.config()
        //nor can you access new object directly with B as below
        // B obj1 = new B();

        //below is how we access B class method. Note we would need an object of A class to access B.
        A.B obj1 = obj.new B();
        obj1.config();

        //else we can make Class C as static which would avoid needing obj of class A.
        //Note: Only inner class can be made static and not outer or top most class
        A.C obj2 = new A.C();
        obj2.config();
    }
}
