package com.company;
class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int a){
        System.out.println("I am parameter based Overloaded constructor: "+a);
    }
}
class derived1 extends base1{
    derived1()
    {
        super(5);
        System.out.println("I am a derived class Constructor");
    }
    derived1(int x,int y)
    {
        super(x);
        System.out.println("I am 2 derived class Overloaded constructor with y value: "+y);
    }
}
class ChildOfDerived extends derived1{
    ChildOfDerived(){
        System.out.println("I am a Child of Derived Constructor: ");
    }
    ChildOfDerived(int x,int y, int z){
        super(x,y);
        System.out.println("I am a child of Derived Constructor: "+z);
    }
}
public class conswithinherit{
    public static void main(String[] args) {
        // base1 a=new base1();
        // derived1 d=new derived1(13,72);
        ChildOfDerived k=new ChildOfDerived(14,56,88);

    }
}
