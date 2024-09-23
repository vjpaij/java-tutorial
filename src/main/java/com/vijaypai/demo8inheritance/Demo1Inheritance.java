package com.vijaypai.demo8inheritance;

public class Demo1Inheritance {
    public static void main(String[] args) {

        Demo1AdvCalc cal = new Demo1AdvCalc();
        int r1 = cal.add(3,6);
        int r2 = cal.sub(4,7);
        int r3 = cal.mul(3,-6);
        int r4 = cal.div(2,2);
        int r5 = cal.mod(7,3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }

}
