package Feb7.Level1;

/*Insurance Problem Statement
You are working on an insurance application where you need to manage and process a list of
insurance policies. Each policy has the following attributes:
● Policy Number (String)
● Holder Name (String)
● Premium Amount (double)
You are tasked with implementing several features using Java 8 Lambda expressions to handle
operations on these insurance policies.
Requirements:
1. Filter Policies by Premium Amount: Write a lambda expression to filter and retrieve a
list of policies with a premium amount greater than $1,200.
2. Sort Policies by Holder Name: Use a lambda expression to sort the policies
alphabetically by the holder's name.
3. Compute Total Premium: Implement a lambda expression to compute the total
premium amount of all policies.
4. Print Policy Details: Use a lambda expression to print out the details of all policies in a
formatted manner.
5. Filter Policies by Premium Range
a. Problem: Use the Stream API to filter out policies where the premium amount is
between $1,000 and $2,000.
6. Find Policy with Highest Premium
a. Problem: Use the Stream API to identify the policy with the highest premium
amount from a list of insurance policies.
7. Group Policies by Holder Name Initial
a. Problem: Use the Stream API to group insurance policies based on the initial
letter of the holder's name.
8. Compute Average Premium
a. Problem: Use the Stream API to calculate the average premium amount of all
insurance policies.

9. Sort Policies by Premium and Print
a. Problem: Use the Stream API to sort insurance policies by premium amount in
ascending order and print their details.
10. Check If Any Policy Exceeds a Certain Premium
a. Problem: Use the Stream API to determine if there is any policy with a premium
amount greater than $2,000.
11. Count Policies for Each Premium Range
a. Problem: Use the Stream API to count the number of policies within specific
premium ranges (e.g., $0-$1,000, $1,001-$2,000, >$2,000).

12. Extract Unique Holder Names
a. Problem: Use the Stream API to extract and print a list of unique holder names
from the insurance policies.
13. Find Policies by Holder Name Substring
a. Problem: Use the Stream API to find all policies where the holder's name
contains a specific substring (e.g., "Smith").
14. Create a Map of Policy Numbers to Premium Amounts
a. Problem: Use the Stream API to create a map where the key is the policy
number and the value is the premium amount.

15. Finding the Most Frequent Words in a Text Corpus using Streams and Lambda
Expressions.
You are given a large text corpus, and your task is to find the most frequent words in the
text. To accomplish this, you should follow these steps:
1. Read the text corpus into a Java program.
2. Tokenize the text into words. You should split the text into words, removing
punctuation and converting all words to lowercase.
3. Count the frequency of each word in the text.
4. Find the top N most frequent words.
5. Display the top N words and their frequencies.
6.
16. To find the second most repeated word in a sequence of words
1. Tokenize the sequence into words.
2. Count the frequency of each word.
3. Find the word with the second-highest frequency.
 */

import java.util.*;
import java.util.stream.*;

class Policy {
    private String policyNumber;
    private String holderName;
    private double premiumAmount;
    public Policy(String policyNumber,String holderName,double premiumAmount){
        this.policyNumber=policyNumber;
        this.holderName=holderName;
        this.premiumAmount=premiumAmount;
    }
    public String getPolicyNumber(){
        return policyNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getPremiumAmount(){
        return premiumAmount;
    }
    @Override
    public String toString(){
        return "PolicyNumber="+policyNumber+", Holder="+holderName+", Premium="+premiumAmount;
    }
}
public class InsuranceApp {
    public static void main(String[] args){
        List<Policy> policies=Arrays.asList(
                new Policy("P101","Alice Smith",900),
                new Policy("P102","Bob Johnson",1500),
                new Policy("P103","Charlie Smith",2500),
                new Policy("P104","David Brown",1800),
                new Policy("P105","Emma Watson",1200),
                new Policy("P106","Frank Miller",3000)
        );
        List<Policy> highPremiumPolicies=policies.stream().filter(p->p.getPremiumAmount()>1200).collect(Collectors.toList());
        policies.stream().sorted(Comparator.comparing(Policy::getHolderName)).forEach(System.out::println);
        double totalPremium=policies.stream().mapToDouble(Policy::getPremiumAmount).sum();
        policies.forEach(p->System.out.println("Policy: "+p.getPolicyNumber()+", Holder: "+p.getHolderName()+", Premium: "+p.getPremiumAmount()));
        policies.stream().filter(p->p.getPremiumAmount()>=1000 && p.getPremiumAmount()<=2000).forEach(System.out::println);
        Optional<Policy> highestPremium=policies.stream().max(Comparator.comparingDouble(Policy::getPremiumAmount));
        highestPremium.ifPresent(System.out::println);
        Map<Character, List<Policy>> groupedByInitial=policies.stream().collect(Collectors.groupingBy(p->p.getHolderName().charAt(0)));
        double averagePremium=policies.stream().mapToDouble(Policy::getPremiumAmount).average().orElse(0);
        policies.stream().sorted(Comparator.comparingDouble(Policy::getPremiumAmount)).forEach(System.out::println);
        boolean existsHighPremium=policies.stream().anyMatch(p -> p.getPremiumAmount() > 2000);
        Map<String, Long> premiumRangeCount=policies.stream().collect(Collectors.groupingBy(p->{
                            if(p.getPremiumAmount()<=1000) return "0-1000";
                            else if(p.getPremiumAmount()<=2000) return "1001-2000";
                            else return ">2000";
                        },Collectors.counting()));
        policies.stream().map(Policy::getHolderName).distinct().forEach(System.out::println);
        policies.stream().filter(p->p.getHolderName().contains("Smith")).forEach(System.out::println);
        Map<String, Double> policyPremiumMap=policies.stream().collect(Collectors.toMap(Policy::getPolicyNumber, Policy::getPremiumAmount));
        String text="Java streams make java powerful and streams simplify data processing";
        Map<String,Long> wordFrequency=Arrays.stream(text.toLowerCase().replaceAll("[^a-z ]","").split("\\s+")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
        int topN=3;
        wordFrequency.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).limit(topN).forEach(System.out::println);
        Optional<Map.Entry<String,Long>> secondMostRepeated=wordFrequency.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).skip(1).findFirst();
        secondMostRepeated.ifPresent(e->System.out.println("Second most frequent word: "+e.getKey()));
    }
}