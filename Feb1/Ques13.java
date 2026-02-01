package Feb1;

/*Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.
*/

import java.util.*;

public class Ques13 {
    static class Patient implements Comparable<Patient>{
        String name;
        int severity;
        public Patient(String name,int severity){
            this.name=name;
            this.severity=severity;
        }
        @Override
        public int compareTo(Patient other){
            return Integer.compare(other.severity,this.severity);
        }
    }
    public static void main(String[] args){
        PriorityQueue<Patient> queue=new PriorityQueue<>();
        queue.add(new Patient("John",3));
        queue.add(new Patient("Alice",5));
        queue.add(new Patient("Bob",2));
        System.out.println("Treatment Order:");
        while(!queue.isEmpty()){
            Patient p=queue.poll();
            System.out.println(p.name);
        }
    }
}
