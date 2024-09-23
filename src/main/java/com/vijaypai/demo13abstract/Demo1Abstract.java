package com.vijaypai.demo13abstract;

abstract class Car{
//    public void drive()
//    {
//
//    }
    //when you dont know what has to be implementation of above method but has to be used by child class
    // we define it as abstract as below
    //and when we have a method as abstract, the class also has to be an abstract class
    //Note : We cannot create i.e. instantiate object of an abstract class

    abstract public void drive();

    public void music()
    {
        System.out.println("Playing Music");
    }
}

//class that extends to abstract class is called concrete class
class Maruti extends Car{
    @Override
    public void drive() {
        System.out.println("Driving");
    }
}

public class Demo1Abstract {
    public static void main(String[] args) {

        Car obj =  new Maruti();
        obj.drive();
        obj.music();

    }
}
