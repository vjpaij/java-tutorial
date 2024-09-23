package com.vijaypai.demo22stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1StreamAPI {
    public static void main(String[] args) {

    //Easier way to add data in an array is through Arrays.asList
        List<Integer> nums = Arrays.asList(3,6,2,1,8,4);
        int sum = 0;

        System.out.println(nums);

        for (int ind : nums)
        {
            if (ind%2 == 0)
            {
               ind = 2*ind;
               sum = sum + ind;
            }
        }
        System.out.println(sum);
        System.out.println(nums);

        //above method sometimes can change the value of nums. in order to safeguard it, we yse streams
        //Note that stream once used cannot be reused

        //lambda expression: n is the value -> what do you want to do with variable.

//        List<Integer> num = Arrays.asList(3,4,8,2,1,3);
//        Stream<Integer> st1 = num.stream();
//        Stream<Integer> st2 = st1.filter(n -> n%2==0);
//        Stream<Integer> st3 = st2.map(n -> n*2);
//        int r = st3.reduce(0,(c,e) -> c+e);

        //the whole of above stream statement can be written in one
        int r = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0,(c,e) -> c+e);
        System.out.println(r);

//        st3.forEach(n -> System.out.println(n));


//        for(int i : num)
//        {
//            System.out.println(i);
//        }
    }

}
