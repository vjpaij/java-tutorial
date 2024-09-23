package com.vijaypai.demo4array;

public class Demo3JaggedArray {

    public static void main(String[] args) {

    // when the size the array varies in size
        int nums[][] = new int[2][];
        nums[0] = new int[3];
        nums[1] = new int[4];

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j<nums[i].length;j++)
            {
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
