package com.vijaypai.demo5string;

public class Demo1String {

    public static void main(String[] args) {
        // String is immutable i.e. it cannot changed
        // In the below example though name gets assigned with new data, the address in heap is different.
        String name = "Pai";

        System.out.println(name);
        name = "Vijay " + name;
        System.out.println(name);

        //StringBuffer and StringBuilder are mutable

        StringBuffer sb = new StringBuffer("Jeppu");
        sb.append("VP");

        System.out.println(sb);
    }
}
