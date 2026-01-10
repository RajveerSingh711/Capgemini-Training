package Jan9;

/*Convert binary to decimal and vice versa*/

import java.util.*;

public class Ques18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int ans=0;
        String s=Integer.toString(n);
        for(int i=s.length()-1;i>=0;i--){
            int a=s.charAt(i)-'0';
            ans+=a*Math.pow(2,k);
            k++;
        }
        System.out.print(ans);
    }
}
