package Jan28;

/*Circular Tour Problem
Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
*/

import java.util.*;

public class Ques5 {
    static int circularTour(int petrol[],int distance[]){
        int n=petrol.length;
        int start=0,surplus=0,deficit=0;
        for(int i=0;i<n;i++){
            surplus+=petrol[i]-distance[i];
            if(surplus<0){
                deficit+=surplus;
                start=i+1;
                surplus=0;
            }
        }
        return (surplus+deficit>=0)?start:-1;
    }
    public static void main(String[] args) {
        int[] petrol={6,3,7};
        int[] distance={4,6,3};
        System.out.println(circularTour(petrol, distance));
    }
}
