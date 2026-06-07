import java.util.Scanner;
public class minimum_ele_each_row {
    public static void main(String[] args){
        int i, j, m, n;
        int temp;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            temp=arr[i][0];
            for(j=0;j<m;j++){
                if(arr[i][j]<temp){
                    temp=arr[i][j];
                }
            }
            System.out.println("Minimum Element in the row: "+ temp);
        }
    }
}
