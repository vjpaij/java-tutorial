package com.vijaypai.demo15interface;

interface A{
    //when all methods in a class are abstract we can use interface instead of abstract class.

    //if instance variable has to be defined, it must be assigned with a value else it will throw an
    //error.This is because by default the variables in interfaces are final and static

    int age = 20;
    String college = "CHS";

    //all methods of interface are by default public abstract
    void show();
    void display();
}

interface C{
    void run();
}

interface D extends C{

}

//unlike classes extends, classes can be implemented with multiple interfaces
class B implements A,C{

    @Override
    public void show() {
        System.out.println("In Show B");
    }

    @Override
    public void display() {
        System.out.println("In Display B");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

// class to class -> extends
//interface to interface -> extends
//class to interface ->implements


public class Demo1Interface{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
        obj.run();
        int r1 = A.age;
        String r2 = A.college;

        System.out.println(r1 + " " + r2);
    }
}
