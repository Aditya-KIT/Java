package com.company;
class base{
    int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
class derived extends base{
    int y;
    public void setY(int y)
    {
        this.y=y;
    }

    public int getY() {
        return y;
    }
}

public class first_inheritence {
    public static void main(String[] args) {
        base b=new base();
        // in base class setting id
        b.setId(9);
        System.out.println(b.getId());
        // derived class setting y
        System.out.println("Derived Class");
        derived k=new derived();
        k.setY(44);
        System.out.println(k.getY());
        // Using base class setId from derived class
        k.setId(77);
        System.out.println(k.getId());

    }
}
