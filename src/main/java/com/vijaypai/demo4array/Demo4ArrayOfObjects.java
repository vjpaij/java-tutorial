package com.vijaypai.demo4array;

class Student{

    int rollno;
    String name;
    int marks;
}

public class Demo4ArrayOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 11;
        s1.name = "Harsh";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 22;
        s2.name = "Hameed";
        s2.marks = 37;

        Student s3 = new Student();
        s3.rollno = 33;
        s3.name = "Harris";
        s3.marks = 84;

        Student studs[] = new Student[3];
        studs[0] = s1;
        studs[1] = s2;
        studs[2] = s3;

        // below gives the address as it is the object.
        for(int i = 0; i < studs.length; i++)
        System.out.println(studs[i]);

        //for actual value we should use below
        for(int j = 0; j < studs.length; j++)
            System.out.println(studs[j].name + " " + studs[j].marks);

    }
}
