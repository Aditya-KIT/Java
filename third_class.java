package com.company;
class newemployee{
    int id;
    long phone;
    String father_name;

    // Creating Setter & Getter

    public void setId(int n)
    {
        id=n;
    }
    public int getId()
    {
        return id;
    }
    public void setPhone(long p){
        phone=p;
    }
    public long getPhone(){
        return phone;
    }

    public void setFather(String father_name) {
        this.father_name = father_name;
    }

    public String getFather() {
        return father_name;
    }
}
public class third_class {
    public static void main(String[] args) {
        newemployee ram= new newemployee();
        ram.setId(8992);
        ram.setPhone(6832939902L);
        ram.setFather("Kumar");
        System.out.println(ram.getId());
        System.out.println(ram.getFather());
        System.out.println(ram.getPhone());
    }
}
