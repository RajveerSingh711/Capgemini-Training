package Feb1;

/*Insurance Policy Management System

Each policy has the following attributes:
● Policy Number (unique identifier)
● Policyholder Name
● Expiry Date
● Coverage Type (e.g., Health, Auto, Home)
● Premium Amount

Requirements:
1. Store Unique Policies: Implement methods to store policies using different
types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
purposes:
 HashSet for quick lookups.
 LinkedHashSet to maintain the order of insertion.
 TreeSet to maintain policies sorted by expiry date.

2. Retrieve Policies: Implement methods to retrieve and display policies based on
certain criteria:
 All unique policies.
 Policies expiring soon (within the next 30 days
 Policies with a specific coverage type.
 Duplicate policies based on policy numbers.

3. Performance Comparison: Compare the performance of HashSet,
LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
policies.
*/

import java.util.*;
import java.time.*;

class Policy implements Comparable<Policy>{
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;
    public Policy(String policyNumber,String policyHolderName,LocalDate expiryDate,String coverageType,double premiumAmount){
        this.policyNumber=policyNumber;
        this.policyHolderName=policyHolderName;
        this.expiryDate=expiryDate;
        this.coverageType=coverageType;
        this.premiumAmount=premiumAmount;
    }
    public String getPolicyNumber(){
        return policyNumber;
    }
    public LocalDate getExpiryDate(){
        return expiryDate;
    }
    public String getCoverageType(){
        return coverageType;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Policy)) return false;
        Policy policy=(Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }
    @Override
    public int hashCode(){
        return Objects.hash(policyNumber);
    }
    @Override
    public int compareTo(Policy other){
        int cmp=this.expiryDate.compareTo(other.expiryDate);
        return (cmp!=0)?cmp:this.policyNumber.compareTo(other.policyNumber);
    }
    @Override
    public String toString(){
        return policyNumber + " | "+policyHolderName+" | "+coverageType+" | Exp: "+expiryDate+" | ₹"+premiumAmount;
    }
}
class PolicyManager{
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();
    public void addPolicy(Policy policy){
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    public void displayAllPolicies(){
        hashSet.forEach(System.out::println);
    }
    public void policiesExpiringSoon() {
        LocalDate today=LocalDate.now();
        LocalDate limit=today.plusDays(30);
        for(Policy p:treeSet){
            if(!p.getExpiryDate().isAfter(limit)) System.out.println(p);
        }
    }
    public void policiesByCoverage(String coverageType){
        for (Policy p:hashSet){
            if(p.getCoverageType().equalsIgnoreCase(coverageType)) System.out.println(p);
        }
    }
    public void findDuplicatePolicies(List<Policy> policies){
        Set<String> seen=new HashSet<>();
        Set<String> duplicates=new HashSet<>();
        for(Policy p:policies){
            if(!seen.add(p.getPolicyNumber())) duplicates.add(p.getPolicyNumber());
        }
        System.out.println("Duplicate Policy Numbers: "+duplicates);
    }
}
public class InsurancePolicyManagementSystem {
    public static void main(String[] args){
        PolicyManager manager=new PolicyManager();
        Policy p1=new Policy("P101","Alice",LocalDate.now().plusDays(10),"Health",5000);
        Policy p2=new Policy("P102","Bob",LocalDate.now().plusDays(40),"Auto",3000);
        Policy p3=new Policy("P103","Charlie",LocalDate.now().plusDays(20),"Home",7000);
        Policy p4=new Policy("P101","Alice",LocalDate.now().plusDays(10),"Health",5000);
        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);
        System.out.println("\n=== All Unique Policies ===");
        manager.displayAllPolicies();
        System.out.println("\n=== Policies Expiring Within 30 Days ===");
        manager.policiesExpiringSoon();
        System.out.println("\n=== Health Insurance Policies ===");
        manager.policiesByCoverage("Health");
        System.out.println("\n=== Duplicate Policies ===");
        manager.findDuplicatePolicies(Arrays.asList(p1,p2,p3,p4));
    }
}
