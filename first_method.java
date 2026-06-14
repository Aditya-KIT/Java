import java.util.Scanner;
public class first_method {
    static int sum(int a, int b)
    {
        int z;
        if(a>b)
            z=a+b;
        else
            z=a*b;
        return z;
    }

    public static void main(String[] args) {
        System.out.print("Enter the Value of A: ");
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print("Enter the Value of B: ");
        int B=sc.nextInt();
        int k=sum(A,B);
        System.out.println(k);
    }


}
