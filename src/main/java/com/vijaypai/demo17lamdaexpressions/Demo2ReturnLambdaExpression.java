package com.vijaypai.demo17lamdaexpressions;

interface B
{
    int add(int i, int j);
}

public class Demo2ReturnLambdaExpression {
    public static void main(String[] args) {

//        B obj = new B() {
//            @Override
//            public int add(int i, int j) {
//                return i+j;
//            };
//        };

        //writing in lambda expression. And when there is a return, no need to mention return keyword.
        //datatypes of i and j inside the bracket also need not be mentioned.
        B obj = (i, j) -> i + j;
        int result = obj.add(3,8);
        System.out.println(result);
        System.out.println(obj.add(3,8));
    }

}
