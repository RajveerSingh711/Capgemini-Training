package Feb10.Level2;

/*Create a class LegacyAPI with an old method oldFeature(), which should not be used anymore. Instead, introduce a new method newFeature().
🔹 Steps to Follow:
Define a class LegacyAPI.
Mark oldFeature() as @Deprecated.
Call both methods and observe the warning.
*/

class LegacyAPI{
    @Deprecated
    public void oldFeature(){
        System.out.println("Old feature (deprecated)");
    }
    public void newFeature(){
        System.out.println("New feature (recommended)");
    }
}
public class Ques2 {
    public static void main(String[] args){
        LegacyAPI api=new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}
