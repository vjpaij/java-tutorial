package com.vijaypai.demo8inheritance;

class X{

    public void show()
    {
        System.out.println("In show X");
    }

    public void config()
    {
        System.out.println("In config X");
    }
        }

class Y extends X{

    public void show()
    {
        System.out.println("In show Y");
    }
}

public class Demo2Override{
    public static void main(String[] args) {

        //overriding is child class method to be executed instead of parent's class
        Y y = new Y();
        y.show();
        y.config();
    }
}
