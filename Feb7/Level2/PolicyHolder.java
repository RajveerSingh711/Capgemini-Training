package Feb7.Level2;

/*Problem Statement: You have a list of PolicyHolder objects with the following fields:
holderId, name, age, policyType, and premiumAmount. Write a method to perform the
following operations:
1. Filter: Select policyholders with a policyType of "Life" and age greater than 60.
2. Transform: Create a new list of RiskAssessment objects containing holderId, name,
and a risk score calculated as premiumAmount / age.
3. Sort: Sort these risk assessments by the risk score in descending order.
4. Categorize: Group these policy holders into risk categories: "High Risk" for risk scores
above 0.5 and "Low Risk" otherwise.
*/

import java.util.*;
import java.util.stream.*;

public class PolicyHolder {
    private int holderId;
    private String name;
    private int age;
    private String policyType;
    private double premiumAmount;
    public PolicyHolder(int holderId,String name,int age,String policyType,double premiumAmount){
        this.holderId=holderId;
        this.name=name;
        this.age=age;
        this.policyType=policyType;
        this.premiumAmount=premiumAmount;
    }
    public int getHolderId(){
        return holderId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPolicyType(){
        return policyType;
    }
    public double getPremiumAmount(){
        return premiumAmount;
    }
    static class RiskAssessment{
        private int holderId;
        private String name;
        private double riskScore;
        public RiskAssessment(int holderId,String name,double riskScore){
            this.holderId=holderId;
            this.name=name;
            this.riskScore=riskScore;
        }
        public double getRiskScore(){
            return riskScore;
        }
        @Override
        public String toString(){
            return "HolderId: "+holderId+", Name: "+name+", RiskScore: "+riskScore;
        }
    }
    public static void main(String[] args){
        List<PolicyHolder> policyHolders=Arrays.asList(
                new PolicyHolder(1,"Alice",65,"Life",40000),
                new PolicyHolder(2,"Bob",62,"Life",25000),
                new PolicyHolder(3,"Charlie",58,"Life",30000),
                new PolicyHolder(4,"David",70,"Life",60000),
                new PolicyHolder(5,"Eve",75,"Health",50000),
                new PolicyHolder(6,"Frank",68,"Life",20000)
        );
        Map<String,List<RiskAssessment>> categorizedRisk=policyHolders.stream().filter(p->"Life".equals(p.getPolicyType())).filter(p->p.getAge()>60).map(p->new RiskAssessment(p.getHolderId(), p.getName(),p.getPremiumAmount()/p.getAge())).sorted(Comparator.comparingDouble(RiskAssessment::getRiskScore).reversed()).collect(Collectors.groupingBy(r->r.getRiskScore()>0.5?"High Risk":"Low Risk"));
        categorizedRisk.forEach((category,list)->{
            System.out.println("\n"+category+":");list.forEach(System.out::println);
        });
    }
}
