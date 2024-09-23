package com.vijaypai.demo16enum;

enum Phones{
    //As mentioned values here act as objects. And we are passing a parameter. So this is a constructor.
    //By hovering the cursor over it, it tells its a constructor
    //now to tell the numbers are the price, we need to declare price as an instance variable
    Pixel(2000), Samsung(1600), Nokia(1000), OnePlus(1400);

    private int price;

    //build constructor
    Phones(int price) {
        this.price = price;
    }

    //build getters and setters


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo2EnumConstructor {
    public static void main(String[] args) {

        Phones p = Phones.Nokia;
        System.out.println(p);
        System.out.println(p.getPrice());

    }
}
