package com.vijaypai.demo17lamdaexpressions;

//Interface with just one method is called Functional Interface. It is also called Single Abstract
//Method (SAM). This can be shown by annotation @FunctionalInterface. By doing that, it wont allow to
//add another method into the interface.
@FunctionalInterface
interface A{
    void show();
}


public class Demo1LambdaExpressions {
    public static void main(String[] args) {

    //below is how we defined Inner Anonymous Class
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("Inner Anonymous Class");
//            }
//        };

    // But above same can be done lambda expressions. This is to make less verbose i.e. need not have
    //to write every line of code which implicits that code anyway. This is shown as ->
        A obj = () ->
        {
                System.out.println("Lambda Expression");
        };

            obj.show();
    }

}
