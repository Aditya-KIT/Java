package com.company;
public class multiarray {
    public static void main(String[] args) {
        int [][] flats = {{101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304},
                {401, 402, 403, 404}};
        int i,j;
        for(i=0;i<flats.length;i++)
        {
            System.out.print("[");
            for(j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]+" ");
            }
            System.out.print("]");
            System.out.print("\n");

        }
    }
}
