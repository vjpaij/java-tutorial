package com.vijaypai.demo15interface;

//Here for a developer to code, he can use either laptop or desktop. Say if laptops arent there. That
//shouldnt stop developer from coding as desktop is there. So by explicitly mentioning laptop, we are
//doing tight coupling.In such cases we use interface i.e. loose coupling.

interface Computer{
    void hardware();
}

class Laptop implements Computer{
    public void hardware()
    {
        System.out.println("Need Laptop to Code");
    }
}

class Desktop implements Computer{
    public void hardware()
    {
        System.out.println("Can use Desktop to Code");
    }

}

class Developer{
    public void code(Computer device)
    {
        device.hardware();
        System.out.println("Coding an application");
    }
}

public class Demo2InterfaceUse {
    public static void main(String[] args) {

        Developer pai = new Developer();

        Computer mac = new Laptop();
        Computer hp = new Desktop();

       //so now I can either pass mac or hp object to pai for it to work as it has now been loosely
       //coupled with Computer interface
        pai.code(mac);
        pai.code(hp);

    }
}
