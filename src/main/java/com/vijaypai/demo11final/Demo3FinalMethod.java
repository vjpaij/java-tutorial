package com.vijaypai.demo11final;

class NewCalc{

    public final void show()
    {
        System.out.println("By Vijay");
    }

    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends NewCalc{
    //by keeping method final in parent class, overriding like below cannot be done
//    public void show()
//    {
//        System.out.println("By Daisy");
//    }
}

public class Demo3FinalMethod {
    public static void main(String[] args) {

        NewCalc c = new AdvCalc();
        c.show();
        c.sum(3,7);

    }
}
