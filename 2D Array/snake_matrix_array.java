import java.util.*;
public class snake_matrix_array {
    public static void main(String[] args){
        int i,j,n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            if(i%2==0){
            for(j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        else{
            for(j=m-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
}
