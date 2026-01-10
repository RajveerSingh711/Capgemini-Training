package Jan9;

/*Print a pyramid/star pattern*/

import java.util.*;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n+p;j++){
                if(j>=n-i-1) System.out.print("*");
                else System.out.print(" ");
            }
            p++;
            System.out.println();
        }
    }
}
