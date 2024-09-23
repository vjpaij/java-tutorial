package com.vijaypai.demo14innerclass;

class Z
{
    public void show()
    {
        System.out.println("In Show Z");
    }

    public void display()
    {
        System.out.println("In Display Z");
    }
}
// if below class B is getting used only once in entire code, no need to create class. This implementation
//can be done while initiating the object.

//class B extends A
//        {
//            System.out.println("In Show B");
//        }

public class Demo2AnonymousInnerClass {
    public static void main(String[] args) {

        Z obj = new Z()
        {
            public void show()
            {
                System.out.println("In Show B");
            }

            public void display()
            {
                System.out.println("In Display B");
            }

            public void config()
            {
                System.out.println("In Config B");
            }

        };
        obj.show();
        obj.display();

        //cant have obj.config() because config isnt a method in Z. So anonymous inner class can
        //only have methods from parent class.

    }
}
