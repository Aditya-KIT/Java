package com.company;
class Employee{
    int id;
    String name;
    long phone;
    int salary;
    public void printDetails()
    {
        System.out.print("My Id: "+id);
        System.out.print("\nMy Name: "+name);
        System.out.println("\nMy Phone Number: "+phone);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class first_class {
    public static void main(String[] args) {
        Employee world=new Employee(); // Instantiating or Creating New Object 
        // Setting Attribute or properties of object
        world.id=126;
        world.name="Kumar";
        world.phone=8893829395l;
        world.salary=22;
        //System.out.println(world.id);
        //System.out.println(world.name);
        //System.out.println(world.phone);
        world.printDetails();
        int salary=world.getSalary();
        System.out.println(salary);
    }
}
