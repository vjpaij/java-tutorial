package com.vijaypai.demo12objectclass;

import java.util.Objects;

class Car{
    String model;
    double price;

    //below would now override the default toString() of Object Class. This would give the actual value
    //instead of hexstring
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //below equal and hashcodes overrides the Object class methods. This is used when values of 2 objects
    //are to be compared whether they are equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class Demo1ObjectClass {
    //by default every class extends to Object Class
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.model = "Maruti";
        c1.price = 14000;

        Car c2 = new Car();
        c2.model = "Maruti";
        c2.price = 14000;

        //below gives hexstring value of hashcode
        System.out.println(c1);

        //by default toString() is called when a object reference is fetched. The above statement is
        //same as below
        System.out.println(c1.toString());

        //below is to compare if 2 objects have same value i.e. same data
        boolean result = c1.equals(c2);
        System.out.println(result);
    }
}
