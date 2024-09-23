package com.vijaypai.demo14innerclass;

abstract class X
{
    public abstract void show();
}

public class Demo3AbstractAnonymous {
    public static void main(String[] args) {
        // as we know objects cannot be instantiated for abstract class. But we can still build
        //anonymous inner class which behaves like a concrete class extending to class Z.

        X obj = new X() {

            public void show()
            {
                System.out.println("Abstract Anonymous Class");
            }
        };
        obj.show();
    }
}
