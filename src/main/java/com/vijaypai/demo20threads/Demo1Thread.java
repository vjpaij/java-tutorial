package com.vijaypai.demo20threads;

//When you want 2 methods to run parallely, we use threads. (multi-tasking)
class A extends Thread{
    //every thread should have run() method
    public void run()
    {
        for(int i=0;i<=10;i++)
        System.out.println("Hi");

        //in case you want almost equal data to be published by method, you can try sleep. It asks
        // scheduler but no guarantee. scheduler can only try.
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class B extends Thread{
    public void run()
    {
        for(int j=0;j<=10;j++)
            System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Demo1Thread {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        //to start the thread we give start() and not run()
        obj1.start();
        obj2.start();

    }
}
