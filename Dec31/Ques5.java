package Dec31;

/* Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint =>
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___
 */

public class Ques5 {
    public static void main(String[] args){
        int pens=14;
        int students=3;
        int no_of_pens_distributed_equally=pens/students;
        int remaining_pen=pens%students;
        System.out.print("The Pen Per Student is "+no_of_pens_distributed_equally+" and the remaining pen not distributed is "+remaining_pen);
    }
}
