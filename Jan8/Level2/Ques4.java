package Jan8.Level2;

/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method.
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array.
The main function calls the user-defined methods and displays the result.
*/

import java.util.*;

public class Ques4 {
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
        String[][] data=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            data[i][0]=words[i];
            data[i][1]=String.valueOf(findLength(words[i]));
        }
        return data;
    }
    public static int[] findShortestAndLongest(String[][] data){
        int minIdx=0, maxIdx=0;
        for(int i=1;i<data.length;i++){
            int currLen=Integer.parseInt(data[i][1]);
            int minLen=Integer.parseInt(data[minIdx][1]);
            int maxLen=Integer.parseInt(data[maxIdx][1]);
            if(currLen<minLen) minIdx=i;
            if(currLen>maxLen) maxIdx=i;
        }
        return new int[]{minIdx,maxIdx};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=splitUsingCharAt(s);
        String[][] data=wordWithLength(words);
        int[] res=findShortestAndLongest(data);
        System.out.println("Shortest Word: "+data[res[0]][0]);
        System.out.println("Longest Word: "+data[res[1]][0]);
    }
}
