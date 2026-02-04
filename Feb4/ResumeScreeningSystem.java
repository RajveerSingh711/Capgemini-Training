package Feb4;

/*Develop an AI-Driven Resume Screening System that can process resumes for different job roles like Software Engineer, Data Scientist, and Product Manager while ensuring type safety.
Hints:
Create an abstract class JobRole (SoftwareEngineer, DataScientist, ProductManager).
Implement a generic class Resume<T extends JobRole> to process resumes dynamically.
Use a wildcard method (List<? extends JobRole>) to handle multiple job roles in the screening pipeline.
*/

import java.util.*;

abstract class JobRole{
    public abstract String getRoleName();
    public abstract boolean isQualified(ResumeData data);
}
class ResumeData{
    int experience;
    int projects;
    boolean knowsML;
    boolean knowsDSA;
    boolean leadership;
    public ResumeData(int experience,int projects,boolean knowsML,boolean knowsDSA,boolean leadership){
        this.experience=experience;
        this.projects=projects;
        this.knowsML=knowsML;
        this.knowsDSA=knowsDSA;
        this.leadership=leadership;
    }
}
class SoftwareEngineer extends JobRole{
    @Override
    public String getRoleName(){
        return "Software Engineer";
    }
    @Override
    public boolean isQualified(ResumeData data){
        return data.knowsDSA && data.projects>=2;
    }
}
class DataScientist extends JobRole{
    @Override
    public String getRoleName(){
        return "Data Scientist";
    }
    @Override
    public boolean isQualified(ResumeData data){
        return data.knowsML && data.experience>=1;
    }
}
class ProductManager extends JobRole{
    @Override
    public String getRoleName(){
        return "Product Manager";
    }
    @Override
    public boolean isQualified(ResumeData data){
        return data.leadership && data.experience>=2;
    }
}
class Resume<T extends JobRole>{
    private String candidateName;
    private ResumeData data;
    private T jobRole;
    public Resume(String candidateName,ResumeData data,T jobRole){
        this.candidateName=candidateName;
        this.data=data;
        this.jobRole=jobRole;
    }
    public void screen(){
        System.out.println("Candidate: "+candidateName);
        System.out.println("Role Applied: "+jobRole.getRoleName());
        if(jobRole.isQualified(data)) System.out.println("Status: SHORTLISTED ✅");
        else System.out.println("Status: REJECTED ❌");
        System.out.println();
    }
    public T getJobRole(){
        return jobRole;
    }
}
class ScreeningPipeline {
    public static void processRoles(List<? extends JobRole> roles,ResumeData data) {
        for(JobRole role:roles){
            System.out.println("AI Screening for: "+role.getRoleName());
            if(role.isQualified(data)) System.out.println("Result: Eligible");
            else System.out.println("Result: Not Eligible");
            System.out.println();
        }
    }
}
public class ResumeScreeningSystem {
    public static void main(String[] args){
        ResumeData resumeData=new ResumeData(2,3,true,true,false);
        Resume<SoftwareEngineer> seResume=new Resume<>("Raj",resumeData,new SoftwareEngineer());
        Resume<DataScientist> dsResume=new Resume<>("Raj",resumeData,new DataScientist());
        seResume.screen();
        dsResume.screen();
        List<JobRole> roles=List.of(new SoftwareEngineer(),new DataScientist(),new ProductManager());
        ScreeningPipeline.processRoles(roles,resumeData);
    }
}
