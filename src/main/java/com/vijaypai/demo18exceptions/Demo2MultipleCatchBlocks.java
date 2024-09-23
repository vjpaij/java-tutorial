package com.vijaypai.demo18exceptions;

public class Demo2MultipleCatchBlocks {
    public static void main(String[] args) {
        int i = 3;
        String str = null;

        int nums[] = new int[3];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;

        try
        {
            int r = 18 / i;
            System.out.println(r);
            System.out.println(str.length());
            System.out.println(nums[2]);
        }
        catch (ArithmeticException e1)
        {
            System.out.println("Divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Array is out of bound");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(i);
    }
}
