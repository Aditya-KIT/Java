import java.util.Scanner;
public class sum_of_array{
    public static void main(String[] args){
        int n,m,i,j;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                sum +=arr[i][j];
            }
        }
        System.out.print("Sum is "+ sum);
    }
}