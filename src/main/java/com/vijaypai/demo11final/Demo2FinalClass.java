package com.vijaypai.demo11final;

final class Calc{

    public void show()
    {
        System.out.println("In class Calc");
    }

    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }
}
//by keeping class Calc as Final, below inheritance is not possible

//class AdvCalc extends Calc{
//    public void show()
//    {
//        System.out.println("In class AdvCalc");
//    }
//}

public class Demo2FinalClass {
    public static void main(String[] args) {

    }
}
