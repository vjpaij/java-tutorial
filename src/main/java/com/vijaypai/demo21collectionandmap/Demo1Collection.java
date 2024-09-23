package com.vijaypai.demo21collectionandmap;

import java.util.*;

public class Demo1Collection {
    public static void main(String[] args) {

        //Collection is a special interface where we need not have to instantiate an object with
        //Collection interface. This would mean to override so many methods in it.

        //note the numbers here are objects. We have nowhere mentioned it as an int as Collection
        //can hold different datatypes. Hence we need to mention datatype to let Collection know
        // what kind of data it is holding
        //Collection nums = new ArrayList();
        Collection<Integer> nums = new ArrayList();
        nums.add(6);
        nums.add(0);
        nums.add(2);
        nums.add(8);

        //unlike array, Collection can be printed directly to get the values.
        System.out.println(nums);

        //In order to get index number, we can use Link instead of Collection as Collecton doesnt have
        //getindex method but List has. List also has many other useful methods

        List<Integer> num = new ArrayList();
        num.add(3);
        num.add(2);
        num.add(3);
        num.add(6);
        System.out.println(num);

        int ind = num.get(1);
        System.out.println(ind);

        //List can support same values as shown above. In order to have unique values we use Set and
        //Hashset class. And values arent given in the same order.

        Set<Integer> uni = new HashSet();
        uni.add(13);
        uni.add(22);
        uni.add(22);
        uni.add(31);
        uni.add(26);

        System.out.println(uni);

        //To get in sorted by value, we can use treeset

        Set<Integer> tree = new TreeSet();
        tree.add(24);
        tree.add(24);
        tree.add(2);
        tree.add(224);
        tree.add(127);
        System.out.println(tree);
    }
}
