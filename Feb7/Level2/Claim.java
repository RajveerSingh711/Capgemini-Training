package Feb7.Level2;

/*Problem Statement: You have a list of Claim objects with the following fields: claimId,
policyNumber, claimAmount, claimDate, and status. Write a method to perform the
following operations:
1. Filter: Select claims that are in the "Approved" status and have a claimAmount greater
than $5,000.
2. Group: Group these claims by policyNumber.
3. Aggregate: For each policy, calculate the total claimAmount and the average
claimAmount.
4. Top N: Identify the top 3 policies with the highest total claim amounts.
*/

import java.util.*;
import java.util.stream.*;

public class Claim {
    private int claimId;
    private String policyNumber;
    private double claimAmount;
    private String claimDate;
    private String status;
    public Claim(int claimId,String policyNumber,double claimAmount,String claimDate,String status){
        this.claimId=claimId;
        this.policyNumber=policyNumber;
        this.claimAmount=claimAmount;
        this.claimDate=claimDate;
        this.status=status;
    }
    public String getPolicyNumber(){
        return policyNumber;
    }
    public double getClaimAmount(){
        return claimAmount;
    }
    public String getStatus(){
        return status;
    }
    static class PolicyClaimSummary{
        private String policyNumber;
        private double totalAmount;
        private double averageAmount;
        public PolicyClaimSummary(String policyNumber,double totalAmount,double averageAmount){
            this.policyNumber=policyNumber;
            this.totalAmount=totalAmount;
            this.averageAmount=averageAmount;
        }
        public double getTotalAmount(){
            return totalAmount;
        }
        @Override
        public String toString(){
            return "Policy: "+policyNumber+", Total: "+totalAmount+", Average: "+averageAmount;
        }
    }
    public static void main(String[] args){
        List<Claim> claims=Arrays.asList(
                new Claim(1,"P1001",8000,"2024-01-10","Approved"),
                new Claim(2,"P1001",12000,"2024-02-15","Approved"),
                new Claim(3,"P1002",6000,"2024-01-20","Approved"),
                new Claim(4,"P1002",3000,"2024-02-10","Rejected"),
                new Claim(5,"P1003",15000,"2024-03-01","Approved"),
                new Claim(6,"P1003",7000,"2024-03-05","Approved"),
                new Claim(7,"P1004",20000,"2024-03-10","Approved"),
                new Claim(8,"P1005",4000,"2024-03-12","Approved")
        );
        List<PolicyClaimSummary> topPolicies=claims.stream().filter(c->"Approved".equals(c.getStatus())).filter(c->c.getClaimAmount()>5_000).collect(Collectors.groupingBy(Claim::getPolicyNumber)).entrySet().stream().map(entry->{
                            String policy=entry.getKey();
                            List<Claim> policyClaims=entry.getValue();
                            double total=policyClaims.stream().mapToDouble(Claim::getClaimAmount).sum();
                            double average=policyClaims.stream().mapToDouble(Claim::getClaimAmount).average().orElse(0);
                            return new PolicyClaimSummary(policy,total,average);
                        }).sorted(Comparator.comparingDouble(PolicyClaimSummary::getTotalAmount).reversed()).limit(3).collect(Collectors.toList());
        topPolicies.forEach(System.out::println);
    }
}
