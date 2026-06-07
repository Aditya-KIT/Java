import java.util.Scanner;
public class first_2d_array{
    public static void main(String[] args){
        int n,m;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] arr= new int [n][m];
        
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}