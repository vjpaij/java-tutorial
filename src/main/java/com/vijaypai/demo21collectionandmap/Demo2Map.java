package com.vijaypai.demo21collectionandmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//instead of having index, we can have key and value ro represent the data. That is done through Map
public class Demo2Map {
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap();

        //it will give unique key value. duplicates removed. Data displayed wont be same in sequence
        //as entered. For sort we can use TreeMap() class
        //We have hashtable() class as well.This is used for synchronized version

        students.put("John",56);
        students.put("Azhar",21);
        students.put("Navjot",69);
        students.put("Sundar",42);
        students.put("Azhar",81);

        System.out.println(students);
        System.out.println(students.get("Azhar"));
        System.out.println(students.keySet());

        for(String name : students.keySet())
        {
            System.out.println(name + " " + students.get(name));
        }
    }
}
