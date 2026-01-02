package Dec31;

/*Similarly, write the DoubleOpt program by taking double values and doing the same operations.*/

import java.util.*;

public class Ques19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double operation1=a+b*c;
        double operation2=a*b+c;
        double operation3=c+a/b;
        double operation4=a%b+c;
        System.out.print("The results of Int Operations are "+operation1+", "+operation2+", "+operation3+", and "+operation4);
    }
}
