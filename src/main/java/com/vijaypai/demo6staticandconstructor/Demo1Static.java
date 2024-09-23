package com.vijaypai.demo6staticandconstructor;

class Mobile{
    String name;
    int cost;

    static String type;

    //constructor is to instantiate the instance variables. It will have same name as class name
    //It wouldn't return any value. by default a constructor is called even if not coded. This default
    //assigns default value while instantiating the object.
    public Mobile(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    //for static variables we use static block to instantiate as it only needs to be called once
    static
    {
        type = "Smart";
    }

    //static to a variable would mean if a value is changed, it will remain same for all the objects.
    //hence these variables are referred by their class name and not object name during object creation.


    public void display()
    {
        System.out.println(name + " " + cost + " " + type);
    }

    //if you do not want an object to be created to use the method,we use static.
    //note that only static variables can be called in static method directly.
    //but indirectly we can access non static instance variables by passing the obj to the method

    //the reason main method is static because you need not have to create an object of the class.

    public static void display1(Mobile obj)
    {
        System.out.println("Static method " + obj.name + " " + obj.cost + " " + type);
    }

}

public class Demo1Static {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile("Pixel",1200);

        //as we are using constructor, name and cost need not assigned like below.
        //obj1.name = "Pixel";
        //obj1.cost = 1200;
        Mobile.type = "Smart";

        obj1.display();

        Mobile obj2 = new Mobile("iPhone", 1400);
        obj2.name = "iPhone";
        obj2.cost = 1400;
        Mobile.type = "Smart";

        obj2.display();

        Mobile.type = "Smartphone";

        obj1.display();
        obj2.display();

        Mobile.display1(obj1);
        Mobile.display1(obj2);

    }

}
