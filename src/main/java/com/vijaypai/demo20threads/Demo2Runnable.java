package com.vijaypai.demo20threads;

//Sometimes we would have class extended to a class already. That time we cannot extend to Threads as
//multiple inheritance is not allowed. In that case we implement to Runnable Interface.

class M implements Runnable{
    //every thread should have run() method
    public void run()
    {
        for(int i=0;i<=10;i++)
            System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class N implements Runnable{
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

public class Demo2Runnable {
    public static void main(String[] args) {

//        M obj1 = new M();
//        N obj2 = new N();

        Runnable obj1 = new M();
        Runnable obj2 = new N();

        //We cannot use start() as it isnt a method in Runnable. So we need to define Thread objects and
        //pass above objects. Thread class has start()

        //If you check constructor of Thread, you see above objects can be passed as Runnable type.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
