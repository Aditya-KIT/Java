package com.company;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        System.out.println("Welcome to Calculator: ");
        System.out.print("Enter the First Number: ");
        int c=adi.nextInt();
        System.out.print("Enter the Second Number: ");
        int d=adi.nextInt();
        System.out.print("Enter the Operator: ");
        char s=adi.next().charAt(0);
        int result;
        if(s=='+')
        {   result=c+d;
            System.out.print("Sum of Two Number: "+result);
        }
        else if(s=='-') {
            result=c-d;
            System.out.print("Sum of Two Number: "+result);
        } else if(s=='*') {
            result=c*d;
            System.out.print("Product of Two Numbers: "+result);
        } else if(s=='/') {
            result=c/d;
            System.out.print("Division of Two Number: "+result);

        } else
            System.out.println("Error");
    }
}
