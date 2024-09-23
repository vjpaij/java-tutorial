package com.vijaypai.demo16enum;

//when we have specific constants, we can use enums instead of multiple objects

//Status here is a class and values inside behave like objects. Note enums cannot be extended
enum Status{
    Running, Pending, Success, Failed;
}

class GetStatus{
    public void knowStatus(Status s){

        switch (s){
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Running:
                System.out.println("Started");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}

public class Demo1Enum {
    public static void main(String[] args) {

        Status stat = Status.Failed;
        System.out.println(stat);
        //ordinal gives the position starting from 0
        System.out.println(stat.ordinal());

        //to get the values of each, we can use method values which is part of enum. by hovering cursor
        //over values you get to know the returned data is in array format

        Status ss[] = Status.values();
        System.out.println(ss[2]);
        Status r1 = ss[2];
        System.out.println(r1);

        GetStatus gs = new GetStatus();
        gs.knowStatus(Status.Pending);
    }
}
