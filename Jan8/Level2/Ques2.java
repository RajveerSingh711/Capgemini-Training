package Jan8.Level2;

/*Write a program to split the text into words, compare the result with the split() method and display the result
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to find the length of the String without using the built-in length() method.
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/

import java.util.*;

public class Ques2 {
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
    public static String[] splitUsingCharAt(String s){
        int len=findLength(s);
        int wordCount=0;
        for(int i=0;i<len;i++){
            if(i==0 && s.charAt(i)!=' ') wordCount++;
            else if(s.charAt(i)!=' ' && s.charAt(i-1)==' ') wordCount++;
        }
        int[] spaceIndex=new int[wordCount+1];
        int idx=0;
        spaceIndex[idx++]=-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' '){
                spaceIndex[idx++]=i;
            }
        }
        spaceIndex[idx]=len;
        String[] words=new String[wordCount];
        for(int i=0;i<wordCount;i++){
            String w="";
            for(int j=spaceIndex[i]+1;j<spaceIndex[i+1];j++){
                if(s.charAt(j)!=' ')
                    w+=s.charAt(j);
            }
            words[i]=w;
        }
        return words;
    }
    public static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] customSplit=splitUsingCharAt(text);
        String[] builtInSplit=text.split(" ");
        System.out.print("Custom Split: ");
        for(String s:customSplit) System.out.print(s+" ");
        System.out.println();
        System.out.print("Built-in Split: ");
        for(String s:builtInSplit) System.out.print(s+" ");
        System.out.println();
        System.out.println("Both results same: "+compareArrays(customSplit,builtInSplit));
    }
}
