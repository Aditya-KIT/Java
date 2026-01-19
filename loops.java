package com.company;
public class loops {
    public static void main(String[] args) {
        // For Loop
        int i,j;
        System.out.print("Loop from 1 to 25");
        for(i=0;i<25;i++) // for loop
        {
            System.out.print(i+" ");
        }
        System.out.println("Table of 5:");
        for(j=1;j<=10;j++)
        {
            System.out.print(5*j+" ");
        }
        int k=1;
        System.out.println("\nTable of 19");
        while(k<=10){
            System.out.print(k*19+" "); // while loop
            k++;
        }
        int z=0;
        System.out.println("\nEven Number Print");
        do{

            if(z%2==0) {
                System.out.print(z + " "); // do-while loop
                z++;
            }
            else
            {   z++;
                continue;}
        }while(z<=50);
    }
}
