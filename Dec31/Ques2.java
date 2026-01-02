package Dec31;

/* Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___
 */

public class Ques2 {
    public static void main(String[] args){
        int marks_in_maths=94;
        int marks_in_physics=95;
        int marks_in_chemistry=96;
        int sum_of_marks_in_PCM=marks_in_maths+marks_in_physics+marks_in_chemistry;
        int avg_marks_in_PCM=sum_of_marks_in_PCM/3;
        System.out.print("Sam's average mark in PCM is "+avg_marks_in_PCM);
    }
}
