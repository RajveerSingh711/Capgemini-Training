package Dec31;

/* Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___
 */

public class Ques1 {
    public static void main(String[] args){
        int birth_year=2000;
        int current_year=2024;
        int age_of_Harry=current_year-birth_year;
        System.out.print("Harry's age in 2024 is "+age_of_Harry);
    }
}
