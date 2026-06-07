import java.util.Scanner;
public class maximum_row_sum_array{
    public static void main(String[] args){
        int i, j, m, n, temp;
        int sum=0, k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int [][]arr= new int[n][m];

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            temp=0;
            for(j=0;j<m;j++){
                temp+=arr[i][j];
            }
            if(temp>sum){
            sum=temp;
            k=i;
            }
        }
        System.out.print(k);
    }
}