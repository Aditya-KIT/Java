public class java_recursion {
    static int fact(int n)
    {
        int factorial;
        if(n==0 || n==1)
            return 1;
        else
            factorial=n*fact(n-1);
        return factorial;
    }
    static int fib(int a)
    {
        int k=0;
        if(a<=3)
        {System.out.println(k);
        k=a+fib(a+1);
        }
        else
        {
            System.out.println("Error");
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        fib(0);
    }
}
