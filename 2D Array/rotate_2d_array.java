import java.util.Scanner;
public class rotate_2d_array {
    public static void main(String[] args){
        int i,j,m,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<m;j++){
            for(i=n-1;i>=0;i--){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
