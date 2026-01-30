package Jan30;

/*You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".
Approach:
Iterate through the list of sentences.
For each sentence, check if it contains the specific word.
If the word is found, return the current sentence.
If no sentence contains the word, return "Not Found".
*/

import java.util.*;

public class Ques11 {
    static String findSentence(String[] sentences,String targetWord){
        for(String sentence:sentences){
            String words[]=sentence.split("\\W+");
            for(String word:words){
                if(word.equalsIgnoreCase(targetWord)) return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {"Java is a powerful language","I love backend development","Linear search is simple","Practice makes you better"};
        String targetWord="backend";
        String result=findSentence(sentences,targetWord);
        System.out.println(result);
    }
}
