import java.util.Scanner;
public class col_wise_array {
    public static void main(String[] args){
        int i,j, n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
            System.out.println();
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
