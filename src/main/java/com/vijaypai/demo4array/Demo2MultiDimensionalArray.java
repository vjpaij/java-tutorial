package com.vijaypai.demo4array;

public class Demo2MultiDimensionalArray {

    public static void main(String[] args) {

        int nums[][] = new int[2][3];
        int i;
        int j;

        for(i = 0; i < 2; i++)
        {
            for(j = 0; j<3;j++)
            {
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
