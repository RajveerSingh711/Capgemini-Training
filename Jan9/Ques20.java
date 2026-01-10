package Jan9;

/*Print Pascal's Triangle*/

import java.util.*;

public class Ques20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=0;j<n-i-1;j++) System.out.print(" ");
            for(int j=0;j<=i;j++){
                System.out.print(p+" ");
                p=p*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
