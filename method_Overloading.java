package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class method_Overloading {
    static int num() // Static help in associating class with method & helps using method without objext
    {
        int a,b;
        a=10;
        b=12;
        a+=b;
        return a;
    }
    // method overloading is done both method have same name but, have different number of parameter
    static int num(int x,int y)
    {
        x*=y;
        return x;
    }
    static void name() // when we don't have to return value, we use void
    {
        System.out.println("Aditya");
    }
    static void k(int []arr)
    {
        arr[0]=33;
    }

    public static void main(String[] args) {
        System.out.print("Enter the Value of a: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter the Value of b: ");
        int b=sc.nextInt();
        int k=num(a,b);
        if (a>b)
        System.out.println(k);
        else
            System.out.println(num());
        name();
        int []r={22,66,45,78,92};
        k(r);
        System.out.println(r[0]);
    }
}
