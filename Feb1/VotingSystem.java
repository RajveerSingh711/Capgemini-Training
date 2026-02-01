package Feb1;

/*Design a Voting System
Description: Design a system where:
Votes are stored in a HashMap (Candidate -> Votes).
TreeMap is used to display the results in sorted order.
LinkedHashMap is used to maintain the order of votes.
*/

import java.util.*;

public class VotingSystem {
    static class VotingManager{
        private Map<String,Integer> voteCountMap=new HashMap<>();
        private Map<String,Integer> voteOrderMap=new LinkedHashMap<>();
        public void castVote(String candidate){
            voteCountMap.put(candidate,voteCountMap.getOrDefault(candidate,0)+1);
            voteOrderMap.put(candidate,voteOrderMap.getOrDefault(candidate,0)+1);
        }
        public void displayVotesInOrder(){
            System.out.println("Votes in order of casting:");
            voteOrderMap.forEach((candidate,votes)->System.out.println(candidate+" : "+votes));
        }
        public void displaySortedResults(){
            System.out.println("Final results (sorted):");
            Map<String, Integer> sortedResults=new TreeMap<>(voteCountMap);
            sortedResults.forEach((candidate,votes)->System.out.println(candidate+" : "+votes));
        }
    }
    public static void main(String[] args){
        VotingManager manager=new VotingManager();
        manager.castVote("Alice");
        manager.castVote("Bob");
        manager.castVote("Alice");
        manager.castVote("Charlie");
        manager.castVote("Bob");
        System.out.println();
        manager.displayVotesInOrder();
        System.out.println();
        manager.displaySortedResults();
    }
}
