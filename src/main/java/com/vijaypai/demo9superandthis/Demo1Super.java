package com.vijaypai.demo9superandthis;

class A{

    //by default every constructor will have a super() method even if not mentioned.
    //in below example super() has been mentioned explicitly for our understanding.
    //by super() it will call the constructor of parent class.
    //and if you want parameterised constructor of parent class to be called, we need to
    //explicitly mention super() with parameters

    //every class extends to Object by default.
    public A()
    {
        super();
        System.out.println("in contructor A");
    }

    public A(int n)
    {
        super();
        System.out.println("in contructor A int");
    }
}

class B extends A{
    public B()
    {
        super();
        System.out.println("in contructor B");
    }

    public B(int n)
    {
        super(n);
        System.out.println("in contructor B int");
    }
}

public class Demo1Super {
    public static void main(String[] args) {

        B b = new B();
        B bint = new B(5);

    }

}
