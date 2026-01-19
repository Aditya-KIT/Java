package com.company;
import java.util.Scanner; //For taking from user
public class user_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

        System.out.println("Taking Input from User");
        System.out.print("Enter Your Name: ");
        String d=sc.next();
        System.out.println(d);
    }
}
