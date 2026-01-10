package Jan8.Level2;

/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method.
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/

import java.util.*;

public class Ques3 {
    public static int findLength(String s){
        int cnt=0;
        try{
            while(true){
                s.charAt(cnt);
                cnt++;
            }
        }catch(StringIndexOutOfBoundsException e){
            return cnt;
        }
    }
    public static String[] splitUsingCharAt(String text){
        int len=findLength(text);
        int wordCount=0;
        for(int i=0;i<len;i++){
            if(i==0 && text.charAt(i)!=' ') wordCount++;
            else if(text.charAt(i)!=' ' && text.charAt(i-1)==' ') wordCount++;
        }
        int[] idx=new int[wordCount+1];
        int k=0;
        idx[k++]=-1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ') idx[k++]=i;
        }
        idx[k]=len;
        String[] words=new String[wordCount];
        for(int i=0;i<wordCount;i++){
            String w="";
            for(int j=idx[i]+1;j<idx[i+1];j++){
                if(text.charAt(j)!=' ')
                    w+=text.charAt(j);
            }
            words[i]=w;
        }
        return words;
    }
    public static String[][] wordWithLength(String[] words){
        String[][] result=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            result[i][0]=words[i];
            result[i][1]=String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=splitUsingCharAt(s);
        String[][] data=wordWithLength(words);
        System.out.println("Word\tLength");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+Integer.parseInt(data[i][1]));
        }
    }
}
