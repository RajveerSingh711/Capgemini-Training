package Jan9;

/*Matrix transpose or multiplication*/

import java.util.*;

public class Ques25 {
    public static void printTranspose(int matrix1[][]){
        for(int i = 0; i< matrix1[0].length; i++){
            for(int j = 0; j< matrix1.length; j++){
                System.out.print(matrix1[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void matrixMultiplication(int matrix1[][],int matrix2[][]){
        int m1=matrix1.length,n1=matrix1[0].length,m2=matrix2.length,n2=matrix2[0].length;
        if(n1!=m2){
            System.out.print("Cannot multiply");
            return;
        }
        int arr[][]=new int[m1][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n1;k++){
                    arr[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        int matrix1[][]=new int[m1][n1];
        int matrix2[][]=new int[m2][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++) matrix1[i][j]=sc.nextInt();
        }
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++) matrix2[i][j]=sc.nextInt();
        }
        printTranspose(matrix1);
        printTranspose(matrix2);
        matrixMultiplication(matrix1,matrix2);
    }
}
