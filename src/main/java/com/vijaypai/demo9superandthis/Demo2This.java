package com.vijaypai.demo9superandthis;

class C{

    public C()
    {
        super();
        System.out.println("in contructor A");
    }

    public C(int n)
    {
        super();
        System.out.println("in contructor A int");
    }
}

class D extends C{
    public D()
    {
        super();
        System.out.println("in contructor B");
    }

    public D(int n)
    {
        //this() will call the default constructor of same class
        this();
        System.out.println("in contructor B int");
    }
}

public class Demo2This {
    public static void main(String[] args) {

        //D d = new D();
        D dint = new D(5);

    }

}

