package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class switch_calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Switch Calculator: ");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int b=sc.nextInt();
        System.out.print("Enter the Operator: ");
        char c=sc.next().charAt(0);
        int result;
        switch(c)
        {
            case '+':
            {
                result=a+b;
                System.out.print("Sum of Two Number: "+result);
                break;
            }
            case '-':
            {
                result=a-b;
                System.out.print("Sum of Two Number: "+result);
                break;
            }
            case '*':
            {
                result=a*b;
                System.out.print("Product of Two Number: "+result);
                break;
            }
            case '/':
            {
                result=a/b;
                System.out.print("Division of Two Number: "+result);
                break;
            }
            case '%':
            {
                result=(a+b)/2;
                System.out.print("Percentage of Two Number: "+result);
                break;
            }
            default:
            {
                System.out.print("Error in Input");
                break;
            }


        }
    }
}
