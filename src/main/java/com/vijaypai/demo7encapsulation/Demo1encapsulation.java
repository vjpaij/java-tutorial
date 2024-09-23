package com.vijaypai.demo7encapsulation;

class Student{
    //Encapsulation is setting getters and setters. This is to make instance variables
    //not accessible directly. These are set as private

    private String name;
    private String standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

}

public class Demo1encapsulation {
    //Encapsulation is setting getters and setters.
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Pai");
        s1.setStandard("10B");

        System.out.println("Student name " + s1.getName() + " Class " + s1.getStandard());

    }
}
