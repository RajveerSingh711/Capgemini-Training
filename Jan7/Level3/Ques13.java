package Jan7.Level3;

/*Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
Hint =>
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices

Write a Method to find the transpose of a matrix

Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix

Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix
*/

import java.util.*;

public class Ques13 {
    static int[][] createRandomMatrix(int rows, int cols){
        int[][] matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=(int)(Math.random()*9)+1;
            }
        }
        return matrix;
    }
    static int[][] addMatrices(int[][] a,int[][] b){
        int[][] result=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                result[i][j]=a[i][j]+b[i][j];
        return result;
    }
    static int[][] subtractMatrices(int[][] a,int[][] b){
        int[][] result=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                result[i][j]=a[i][j]-b[i][j];
        return result;
    }
    static int[][] multiplyMatrices(int[][] a,int[][] b){
        int[][] result=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<b.length;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }
    static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                transpose[j][i]=matrix[i][j];
        return transpose;
    }
    static int determinant2x2(int[][] m) {
        return (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
    }
    static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])-m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])+m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    static double[][] inverse2x2(int[][] m){
        int det=determinant2x2(m);
        double[][] inv=new double[2][2];
        inv[0][0]=m[1][1]/(double)det;
        inv[0][1]=-m[0][1]/(double)det;
        inv[1][0]=-m[1][0]/(double)det;
        return inv;
    }
    static double[][] inverse3x3(int[][] m){
        int det=determinant3x3(m);
        double[][] inv=new double[3][3];
        inv[0][0]=(m[1][1]*m[2][2]-m[1][2]*m[2][1])/(double)det;
        inv[0][1]=(m[0][2]*m[2][1]-m[0][1]*m[2][2])/(double)det;
        inv[0][2]=(m[0][1]*m[1][2]-m[0][2]*m[1][1])/(double)det;
        inv[1][0]=(m[1][2]*m[2][0]-m[1][0]*m[2][2])/(double)det;
        inv[1][1]=(m[0][0]*m[2][2]-m[0][2]*m[2][0])/(double)det;
        inv[1][2]=(m[0][2]*m[1][0]-m[0][0]*m[1][2])/(double)det;
        inv[2][0]=(m[1][0]*m[2][1]-m[1][1]*m[2][0])/(double)det;
        inv[2][1]=(m[0][1]*m[2][0]-m[0][0]*m[2][1])/(double)det;
        inv[2][2]=(m[0][0]*m[1][1]-m[0][1]*m[1][0])/(double)det;
        return inv;
    }
    static void displayMatrix(int[][] matrix){
        for(int[] row:matrix){
            for(int value:row)
                System.out.print(value+"\t");
            System.out.println();
        }
    }
    static void displayMatrix(double[][] matrix){
        for(double[] row:matrix) {
            for(double value:row)
                System.out.printf("%.2f\t",value);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(matrixA, matrixB));
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));
        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));
        System.out.println("\nDeterminant of Matrix A: " + determinant3x3(matrixA));
        System.out.println("\nInverse of Matrix A:");
        displayMatrix(inverse3x3(matrixA));
    }
}
