package com.vijaypai.demo10polymorphism;

class A
{
    public void show()
    {
        System.out.println("In class A");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In class B");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("In class C");
    }
}

public class Demo1Polymorphism {
    //Runtime polymorphism is called Dynamic Method Dispatch i.e. only in runtime we would know
    //which method would get executed
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        //to assign same object reference to new implementation
        obj = new B();
        obj.show();

        A obj1 = new B();
        obj1.show();

        A obj2 = new C();
        obj2.show();

    }
}
