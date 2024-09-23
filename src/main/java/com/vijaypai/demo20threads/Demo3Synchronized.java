package com.vijaypai.demo20threads;

//if 2 methods are using variables and the value of that variable is getting changed i.e. mutated, then
//the outcome of the result might be incorrect

class Counter{
    int count;

    //in order that count doesnt get incremented only once when both threads action at same time,
    //we give synchronized. The count is not accessed by both threads at same time
    public synchronized void increment(){
        count++;
    }
}

public class Demo3Synchronized {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    c.increment();
                }
            }
        };

        //same as above but written in lambda as Runnable interface is Functional Interface
        Runnable obj2 = () -> {
                for (int j=1;j<=100000;j++)
                {
                    c.increment();
                }

            };

        //We cannot use start() as it isnt a method in Runnable. So we need to define Thread objects and
        //pass above objects. Thread class has start()

        //If you check constructor of Thread, you see above objects can be passed as Runnable type.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //join() is used to wait until both t1 and t2 have completed the entire work.
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.count);

    }
}
