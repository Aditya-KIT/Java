package com.company;
public class array {
    public static void main(String[] args) {
        // First Type to Declare Array
         int [] marks= new int[5];
         marks[0]=50;
         marks[1]=76;
         marks[2]=89;
         marks[3]=55;
         marks[4]=77;
        System.out.println("First type to Declare the Array");
        System.out.println(marks[3]);
        System.out.println(marks[1]);

        // Second Type to Declare Array
        int[] details;
        details= new int[5];
        details[0]= 88;
        details[1]=22;
        details[2]=56;
        details[3]=67;
        details[4]=43;
        System.out.println("Second type to Declare the Array");
        System.out.print(details[3]+ ", ");
        System.out.println(details[0]);

        // Third Type to Declare Array
        String[] world={"Naman","Raman","Rambha","Hello"};
        System.out.println("Third type to Declare the Array");
        System.out.print(world[2]+", ");
        System.out.println(world[3]);
        int[] kumar={78,999,88};
        System.out.println(kumar[1]);
        float []k={55f,99.77f,33f,61.66f};
        System.out.print("Float Array Output: ");
        for(int i=0;i<k.length;i++)
        {
            if(i+1==k.length)
                System.out.print(k[i]);
            else
                System.out.print(k[i]+", ");
        }
        int []z={33,78,22,65,34,22}; // not have to select element size
        System.out.println("\nArray Print through For Each Loop");
        for(int hey:z)
        {
            System.out.print(hey+", ");
        }
    }
}
