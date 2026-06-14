import java.util.Scanner;
public class pascal_triangle {
    public static void main(String[] args){
        int i, j,n,m;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[][]= new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
    }
}
