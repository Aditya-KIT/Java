package com.company;
class MyEmployee{
    private int id;
    private String name;
    // Creating Setter & Getter because of private access modifier

    public void setName(String n)
    {
       name =n;
    }
    public String getName(){
        return name;
    }
    public void setId(int a)
    {
        id=a;
    }
    public int getId()
    {
        return id;
    }
}
public class second_class {
    public static void main(String[] args) {
        MyEmployee vijay=new MyEmployee();
        //vijay.id=13;
        //vijay.name="Shivam"; // It will thorow an error due to private access modifier
       // System.out.println();
        vijay.setId(7872);
        vijay.setName("Raman");
        System.out.println(vijay.getName());
        System.out.println(vijay.getId());
    }
}
